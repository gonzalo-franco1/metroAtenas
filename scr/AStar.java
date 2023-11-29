import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

/** 
 * Clase Comparador que implementa la interfaz Comparator para NodoEstacion
 * */ 
class Comparador implements Comparator<NodoEstacion> {
    /**
     * Método compare que compara dos nodos de estación basándose en su peso total
     * @param a NodoEstacion a
     * @param b NodoEstacion b
     * @return int 1 si el peso total de a es mayor que el de b, -1 si es menor y 0 si son iguales
     *  */ 
    public int compare(NodoEstacion a, NodoEstacion b) {
        if (a.getPesoTotal() > b.getPesoTotal()) {
            return 1;
        } else if (a.getPesoTotal() < b.getPesoTotal()) {
            return -1;
        } else
            return 0;
    }
}

class AStar {
    /**
     * Método estático que implementa el algoritmo A* para encontrar el camino más corto
     * entre dos estaciones.
     * @param origen NodoEstacion de origen
     * @param destino NodoEstacion de destino
     * @return pila Stack<NodoEstacion> con el camino desde el origen hasta el destino
     */
    public static Stack<NodoEstacion> aStar(NodoEstacion origen, NodoEstacion destino) {
        // Pila para almacenar el resultado del camino
        Stack<NodoEstacion> pilaResultado = new Stack<>();
        // Si el origen es igual al destino, retornamos la pila vacía
        if (origen.equals(destino))
            return pilaResultado;
        
        // Conjunto para mantener un registro de las estaciones visitadas
        Set<NodoEstacion> visitados = new HashSet<>();
        // Cola de prioridad para las rutas posibles con el comparador personalizado
        PriorityQueue<NodoEstacion> rutas = new PriorityQueue<>(new Comparador());
        
        // Nodo de la estación actual inicializado con el origen
        NodoEstacion estacionActual = origen;
        // Añadimos el origen a las estaciones visitadas
        visitados.add(origen);
        
        // Variable para llevar el tiempo total de viaje
        int tiempo = 0;
        // Iterador para las conexiones de la estación actual
        Iterator<Conexion> estacionesConectadas;
        // Inicializamos la conexión anterior (utilizada para calcular el tiempo de transbordo)
        Conexion conexionAnterior = new Conexion(origen, origen, 0, 0);
        // Variable para la siguiente conexión
        Conexion conexionSiguiente;
        
        // Mientras la estación actual no sea el destino
        while (!estacionActual.equals(destino)) {
            // Obtenemos las conexiones de la estación actual
            estacionesConectadas = estacionActual.getConexiones();
            // Para cada conexión de la estación actual
            while (estacionesConectadas.hasNext()) {
                // Obtenemos la siguiente conexión
                conexionSiguiente = estacionesConectadas.next();
                // Obtenemos la estación de destino de la conexión
                NodoEstacion estacionSiguiente = conexionSiguiente.getDestino();
                // Calculamos el tiempo hasta la estación siguiente
                int tiempoEstacion = tiempo;
                // Si hay cambio de línea, sumamos el tiempo de transbordo
                if (conexionAnterior.getLinea() != 0 && conexionAnterior.getLinea() != conexionSiguiente.getLinea()) {
                    tiempoEstacion = tiempoEstacion + estacionActual.getTiempoTransbordo();
                }
                // Sumamos el tiempo de viaje de la conexión
                tiempoEstacion = tiempoEstacion + conexionSiguiente.getTViaje();
                // Añadimos la condición heurística basada en la distancia
                // IMPORTANTE:  Si se quiere el algoritmo de Dijkstra, comentar a partir del +
                //              Si se quiere el algoritmo de A*, descomentar a partir del +
                //              La condición heurística está ponderada a 0,4 pero es un óptimo demostrado
                double peso = tiempoEstacion + 0.4*distancia(estacionSiguiente, destino);
                // Si la estación siguiente no ha sido visitada ni está en la cola de prioridad, la agregamos
                if (!visitados.contains(estacionSiguiente) && !rutas.contains(estacionSiguiente)) {
                    estacionSiguiente.setPesoTotal(peso);
                    estacionSiguiente.setTiempoTotal(tiempoEstacion);
                    rutas.add(estacionSiguiente);
                    estacionSiguiente.setEstacionPadre(estacionActual);
                // Si la estación siguiente está en la cola pero con un peso mayor, actualizamos su peso y tiempo total
                } else if (rutas.contains(estacionSiguiente) && (estacionSiguiente.getPesoTotal() > peso)) {
                    estacionSiguiente.setPesoTotal(peso);
                    estacionSiguiente.setTiempoTotal(tiempoEstacion);
                    estacionSiguiente.setEstacionPadre(estacionActual);
                }
            }
            
            // Tomamos la estación con el menor peso total de la cola de prioridad
            estacionActual = rutas.poll();
            // Actualizamos la conexión anterior
            for (Conexion conexion : estacionActual.getEstacionPadre().getConexionesArray()) {
                if (conexion.getDestino().equals(estacionActual)) {
                    conexionAnterior = conexion;
                    break;
                }
            }
            // Añadimos la estación actual a las visitadas y actualizamos el tiempo
            visitados.add(estacionActual);
            tiempo = estacionActual.getTiempoTotal();
        }
        NodoEstacion estacionPadre = estacionActual.getEstacionPadre();
        // Construimos la pila con el camino desde el destino hasta el origen
        pilaResultado.add(estacionActual);
        while (!estacionPadre.equals(origen)) {
            pilaResultado.add(estacionPadre);
            estacionPadre = estacionPadre.getEstacionPadre();
        }
        pilaResultado.add(origen);
        // Devolvemos la pila con el camino encontrado
        return pilaResultado;
    }

    /**
     * Método privado para calcular la distancia entre dos estaciones utilizando la fórmula de Haversine.
     * @param estacionOrigen NodoEstacion de origen
     * @param estacionDestino NodoEstacion de destino
     * @return double distancia en kilómetros entre las dos estaciones
     */
    private static double distancia(NodoEstacion estacionOrigen, NodoEstacion estacionDestino) {
        // Si las estaciones son las mismas, la distancia es 0
        if (estacionOrigen.getNombre().equals(estacionDestino.getNombre())){
            return 0;
        }
        // Radio de la Tierra en kilómetros
        double radioTierra = 6371;
        // Diferencia de latitudes y longitudes en radianes
        double distanciaLatitud = Math.toRadians(estacionDestino.getLatitud() - estacionOrigen.getLatitud());
        double distanciaLongitud = Math.toRadians(estacionDestino.getLongitud() - estacionOrigen.getLongitud());
        // Senos de las mitades de las diferencias de latitud y longitud
        double senoDLatitud = Math.sin(distanciaLatitud / 2);
        double senoDLongitud = Math.sin(distanciaLongitud / 2);
        // Expresión para calcular la distancia
        double expresion1 = Math.pow(senoDLatitud, 2) + Math.pow(senoDLongitud, 2) * Math.cos(Math.toRadians(estacionOrigen.getLatitud()))
                * Math.cos(Math.toRadians(estacionDestino.getLatitud()));
        double expresion2 = 2 * Math.atan2(Math.sqrt(expresion1), Math.sqrt(1 - expresion1));
        // Calculo final de la distancia
        double distancia = radioTierra * expresion2; // en kilómetros
        return distancia; // Si se quisiera en metros, se multiplicaría por 1000
    }
}
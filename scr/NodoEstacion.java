import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que modeliza las estaciones. Una estacion es equivalente a un nodo.
 * Una estacion almacena las estaciones adyacentes (nodos) a traves de "conexiones" (aristas)
 * Ademas es capaz de almacenar metadatos para el algoritmo A*, como el tiempo que
 * se tarda en llegar desde el origen.
 */
public class NodoEstacion {
    // Atributos
    private String nombre;
    private double latitud; // En grados decimales
    private double longitud;
    private double distanciaDestino; 
    private ArrayList<Conexion> conexiones = new ArrayList<Conexion>();
    private NodoEstacion estacionPadre;
    private int tiempoTransbordo;
    private double pesoTotal;
    private int tiempoTotal;

    /**
     * Constructor
     * 
     * @param nombre
     * @param coordenadaX      coordenadas grados decimales (DD)
     * @param coordenadaY      coordenadas grados decimales (DD)
     * @param tiempoTransbordo en minutos. Si no tiene transbordos, es 0.
     */
    public NodoEstacion(String nombre, double latitud, double longitud, int tiempoTransbordo) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.tiempoTransbordo = tiempoTransbordo;
    }
    
    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    /**
     * Anñade una estacion adyacente.
     * @param conexion arista dirigida hacia otra estacion
     */
    public void addConexion(Conexion conexion) {
        this.conexiones.add(conexion);
    }

    /**
     * @return un iterador sobre el conjunto de objetos conexion de la estacion
     */
    public Iterator<Conexion> getConexiones() {
        return conexiones.iterator();
    }

    /**
     * @return lista de tipo ArrayList<Conexion> con las conexiones salientes de la estacion.
     */
    public ArrayList<Conexion> getConexionesArray() {
        return conexiones;
    }

    /**
     * Para su uso por el algoritmo A*
     * @param distanciaDestino
     */
    public void setDistanciaDestino(double distanciaDestino) {
        this.distanciaDestino = distanciaDestino;
    }
    /**
     * Para su uso por el algoritmo A*
     * @return
     */
    public double getDistanciaDestino() {
        return distanciaDestino;
    }

    /**
     * @return string con el nombre de la estacion. Ej: "Neos Kosmos"
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return tiempo en minutos en ejecutar un transbordo. Si no hay transbordo posible, es cero.
     */
    public int getTiempoTransbordo() {
        return tiempoTransbordo;
    }

    /**
     * Para su uso por el algoritmo A*
     */
    public void setEstacionPadre(NodoEstacion estacionPadre) {
        this.estacionPadre = estacionPadre;
    }

    /**
     * Para su uso por el algoritmo A*
     * @return
     */
    public NodoEstacion getEstacionPadre() {
        return estacionPadre;
    }

    /**
     * @return Pretty-print del nombre de la estacion y sus conexiones
     */
    public String toStringLong() {
        return "Nombre: " + nombre +
                "\nConexiones: " + conexiones;
    }

    /**
     * Para su uso por el algoritmo A*
     * @return el tiempo total acumulado para llegar a la estacion desde el origen
     */
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    /**
     * Para su uso por el algoritmo A*
     * @return 
     */
    public double getPesoTotal() {
        return pesoTotal;
    }

    /**
     * Para su uso por el algoritmo A*
     */
    public void setTiempoTotal(int tiempo) {
        this.tiempoTotal = tiempo;
    }

    /**
     * Para su uso por el algoritmo A*
     */
    public void setPesoTotal(double peso) {
        this.pesoTotal = peso;
    }

    /**
     * Nota: se hace @override de Object.toString()
     * Esto hace a la clase "imprimible" de manera nativa.
     * @return el nombre de la estacion
     */
    @Override
    public String toString() {
        return nombre;
    }
}
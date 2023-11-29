/**
 * Clase que modeliza la conexion en una direccion entre dos estaciones
 * Equivale a una arista.
 */
public class Conexion {
    
    //Atributos
    private int tViaje;
    private int linea; // solo 1, comprendido 1-3
    private NodoEstacion origen;
    private NodoEstacion destino;

    /**
     * Constructor
     * 
     * @param origen  nodo de la estacion origen
     * @param destino nodo de la estacion destino
     * @param linea   numero de la linea. Debe ser entero
     * @param tViaje  en minutos, tiempo que tarda el tren en moverse de A a B
     */
    Conexion(NodoEstacion origen, NodoEstacion destino, int linea, int tViaje) {
        this.origen = origen;
        this.destino = destino;
        this.linea = linea;
        this.tViaje = tViaje;
        
    }
    /**
     * @return la linea de metro a la que pertenece esta conexion
     */
    public int getLinea() {
        return linea;
    }

    /**
     * @return el nodo origen de la arista (estacion origen)
     */
    public NodoEstacion getOrigen() {
        return origen;
    }

    /**
     * @return el nodo destino de la arista (estacion destino)
     */
    public NodoEstacion getDestino() {
        return destino;
    }

    /**
     * @return el tiempo que tarda el metro en recorrer la conexion. Equivale al peso de la arista.
     */
    public int getTViaje() {
        return tViaje;
    }

    /**
     * Nota: se hace @override de Object.toString()
     * Esto hace a la clase "imprimible" de manera nativa, útil en depuración.
     * @return origen y destino. Ej: "(Origen: Estacion1, Destino: Estacion2)"
     */
    @Override
    public String toString() {
        return ("(Origen: " + origen + ", Destino: " + destino + ") ");
    }

}
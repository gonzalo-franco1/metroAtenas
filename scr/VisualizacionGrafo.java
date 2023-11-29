import java.util.HashMap;
import java.util.Stack;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

public class VisualizacionGrafo {
    private Graph grafo;
    private Viewer viewer;
    private ViewPanel view;
    //Mejor ignoramos la siguiente línea...
    private String styleSheet = "node {\n" +
            "size: 3px;\n" +
            "text-mode: normal;\n" +
            "text-style: bold;\n" +
            "text-alignment: at-right;\n" +
            "text-size: 12;\n" +
            "}\n" +
            "edge {\n" +
            "    shape: line;\n" +
            "    fill-color: green;\n" +
            "    arrow-size: 3px, 2px;\n" +
            "}\n" +
            "edge.linea1 {stroke-color: #61CF27; stroke-width: 1px; stroke-mode: plain; fill-mode: none;}\n" +
            "edge.linea2 {stroke-color: #FC4539; stroke-width: 1px; stroke-mode: plain; fill-mode: none;}\n" +
            "edge.linea3 {stroke-color: #48DBDF; stroke-width: 1px; stroke-mode: plain; fill-mode: none;}\n" +
            "edge.ruta {stroke-color: #D003FD; stroke-width: 6px; stroke-mode: plain; fill-mode: none;}\n";

    /*
     * Paso 1: iterar por las estaciones y sus conexiones para crear nodos y sus
     * aristas con addEdge
     * Paso 2: iterar los nodos del grafo Graph para ponerles label y coordenadas
     * 
     */
    VisualizacionGrafo(HashMap<String, NodoEstacion> estaciones) {
        this.grafo = new SingleGraph("InterfazGrafo");
        grafo.setStrict(false);
        grafo.setAutoCreate(true);
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        System.setProperty("org.graphstream.ui", "swing");
        grafo.setAttribute("ui.quality");
        grafo.setAttribute("ui.antialias");
        grafo.setAttribute("ui.stylesheet", styleSheet);
        //grafo.display(false);
        this.viewer = new Viewer(grafo, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        for (NodoEstacion estacion : estaciones.values()) {
            for (Conexion estacionConexion : estacion.getConexionesArray()) {
                try {
                    Edge arista = grafo.addEdge(
                            estacion.getNombre() + " <-> " + estacionConexion.getDestino().getNombre(),
                            estacion.getNombre(), estacionConexion.getDestino().getNombre());
                    if (estacionConexion.getLinea() == 1) {
                        arista.setAttribute("ui.class", "linea1");
                    } else if (estacionConexion.getLinea() == 2) {
                        arista.setAttribute("ui.class", "linea2");
                    } else if (estacionConexion.getLinea() == 3) {
                        arista.setAttribute("ui.class", "linea3");
                    }
                } catch (Exception e) {
                }
            }
        }
        for (Node n : grafo) {
            n.setAttribute("ui.label", n.getId());
            double latitud = estaciones.get(n.getId()).getLatitud();
            double longitud = estaciones.get(n.getId()).getLongitud();
            if (n.getId().equals("Pallini")) {
                latitud = 38.0157615;
                longitud = 23.83;
            } else if (n.getId().equals("Peania-Kantza")) {
                latitud = 38.010;
                longitud = 23.83;
            } else if (n.getId().equals("Koropi")) {
                latitud = 37.99999;
                longitud = 23.83;
            } else if (n.getId().equals("Airport")) {
                latitud = 37.98;
                longitud = 23.84;
            } else if (n.getId().equals("Thissio")) {
                latitud = 37.9731;
                longitud = 23.72;
            } else if (n.getId().equals("Megaro Mousikis")) {
                latitud = 37.983;
                longitud = 23.759;
            }
            double coordenadaX = 6371 * Math.cos(Math.toRadians(latitud)) * Math.sin(Math.toRadians(longitud));
            double coordenadaY = 6371 * Math.cos(Math.toRadians(longitud)) * Math.sin(Math.toRadians(latitud));
            n.setAttribute("xy", coordenadaX, coordenadaY);
        }
        view = viewer.addDefaultView(false);
    }

    public void pintarRuta(Stack<NodoEstacion> ruta) {
        if (!ruta.isEmpty()) {
            Object[] arrayRuta = ruta.toArray();
            int i = 1;
            NodoEstacion estacionAnterior = (NodoEstacion) arrayRuta[0];
            while (i < arrayRuta.length) {
                NodoEstacion estacionActual = (NodoEstacion) arrayRuta[i];
                Node nodoEstacion = grafo.getNode(estacionAnterior.getNombre());
                Edge aristaRuta = nodoEstacion.getEdgeBetween(estacionActual.getNombre());
                aristaRuta.setAttribute("ui.class", "ruta");
                estacionAnterior = estacionActual;
                i++;
            }
        }
    }

    public ViewPanel getView() {
        return view;
    }
}
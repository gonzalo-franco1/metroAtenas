import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.graphstream.ui.swingViewer.ViewPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class InterfazUsuario extends JFrame {

	private JPanel contentPane;

	/*
	 * Launcher de la interfaz de usuario
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazUsuario frame = new InterfazUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/*
	 * Create the frame.
	 * 
	 * Esto es el constructor, que incluye lo importante.
	 */
	public InterfazUsuario() {
		BDGrafo miBD = new BDGrafo();
		String[] estaciones = miBD.getArrayEstaciones(); 
		HashMap<String, NodoEstacion> estacionesHashMap = miBD.getEstaciones();
		VisualizacionGrafo miMapa = new VisualizacionGrafo(estacionesHashMap);

		// Configuración de la ventana
		setTitle("Buscador de rutas Atenas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1420, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Ventana mapa
		ViewPanel view = miMapa.getView();
				view.setBounds(400, 10, 1000, 700);
				contentPane.add(view, 0);

		// Texto "Origen"
		JLabel etiquetaOrigen = new JLabel("Origen");
		etiquetaOrigen.setBounds(73, 32, 70, 14);
		contentPane.add(etiquetaOrigen);

		// Desplegable con las estaciones de origen
		JComboBox<String> selectorOrigen = new JComboBox<String>();
		selectorOrigen.setBounds(73, 57, 120, 20);
		llenarDesplegable(selectorOrigen, estaciones);
		contentPane.add(selectorOrigen);

		// Texto "Destino"
		JLabel etiquetaDestino = new JLabel("Destino");
		etiquetaDestino.setBounds(241, 32, 70, 14);
		contentPane.add(etiquetaDestino);

		// Desplegable con las estaciones de destino
		JComboBox<String> selectorDestino = new JComboBox<String>();
		selectorDestino.setBounds(241, 57, 120, 20);
		llenarDesplegable(selectorDestino, estaciones);
		contentPane.add(selectorDestino);

		// Area de texto donde sale la ruta
		JTextArea areaTextoRuta = new JTextArea();
		areaTextoRuta.setBounds(89, 156, 272, 396);
		contentPane.add(areaTextoRuta);

		// Boton buscar y su comportamiento.
		JButton botonBuscar = new JButton("Buscar");
		botonBuscar.setBounds(163, 88, 100, 23);
		botonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Lo que pasa cuando se pulsa el boton buscar
				String origen = (String) selectorOrigen.getSelectedItem();
				String destino = (String) selectorDestino.getSelectedItem();
				NodoEstacion nodoOrigen = miBD.getEstacion(origen);
				NodoEstacion nodoDestino = miBD.getEstacion(destino);
				//LLamada al algorimo
				long tiempoInicial = System.currentTimeMillis();
				Stack<NodoEstacion> pilaCaminoOptimo = null;
				for (int i=0; i<10000; i++){
					pilaCaminoOptimo = AStar.aStar(nodoOrigen, nodoDestino);
				}
				
				long tiempoFinal = System.currentTimeMillis();
				//imprimo el tiempo de ejecucion				
				System.out.println("Tiempo de ejecución del algoritmo (ms): " + (tiempoFinal-tiempoInicial));
				Object[] arrayCaminoOptimo = pilaCaminoOptimo.toArray(); 
				VisualizacionGrafo miMapa = new VisualizacionGrafo(estacionesHashMap);
				miMapa.pintarRuta(pilaCaminoOptimo);
				ViewPanel view = miMapa.getView();
				view.setBounds(400, 10, 1000, 700);
				contentPane.remove(0);
				contentPane.add(view, 0);
				// Composicion del texto con el tiempo y la ruta
				String ruta = "Tiempo total:  \n\t" + nodoDestino.getTiempoTotal() + "min" +
						"\nRuta optima: \n";
				for (int i = arrayCaminoOptimo.length - 1; i >= 0; i--)
					ruta += ("\t" + arrayCaminoOptimo[i].toString() + "\n");
				areaTextoRuta.setText(ruta);
			}
		});
		contentPane.add(botonBuscar);
		JButton btnNewButton = new JButton("Ver mapa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualizacionGrafo miMapa = new VisualizacionGrafo(estacionesHashMap);
				ViewPanel view = miMapa.getView();
				view.setBounds(400, 10, 1000, 700);
				contentPane.remove(0);
				contentPane.add(view, 0);
			}
		});
		btnNewButton.setBounds(163, 122, 100, 23);
		contentPane.add(btnNewButton);

	}

	// Llena un desplegable JCOmboBox con un array de strings.
	private void llenarDesplegable(JComboBox<String> desplegable, String[] contenidos) {
		for (int i = 0; i < contenidos.length; i++)
			desplegable.addItem(contenidos[i]);
	}
}

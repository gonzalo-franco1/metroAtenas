# metroAtenas
¿Qué es?
Programa que permite calcular la ruta óptima entre estaciones del metro de Atenas. 

¿Cómo se ejecuta?
Hay un .jar ejecutable
Si se desea compilar en local, la clase ejecutable con el main es "interfazUsuario".

¿Cómo funciona internamente?
Tiene en cuenta datos realistas de distancia geográfica entre estaciones, tiempo de trayecto del metro entre estaciones y tiempos de transbordo, obtenidos de www.emetro.gr.
Internamente, utiliza el algoritmo A* que utiliza como principal criterio de búsqueda los tiempos, pero añade como condición heurística para acelerar la búsqueda la posición geográfica de las estaciones. 
El código de la "base de datos" fue generado con excel y python, aunque requirió de una cierta artesanía dada la poca accesibilidad para máquinas de la web del metro de Atenas.
Se modelizaron las estaciones como nodos y las conexiones entre ellas como aristas. 



# metroAtenas
(spanish below)

**What is it?**
A program that allows to calculate the optimal route between Athens metro stations. 

**How is it executed?**
There is an executable .jar .
If you want to compile locally, the executable class with the main is ‘interfazUsuario’.

**How does it work internally?**
It takes into account realistic data on geographical distance between stations, metro travel time between stations and transfer times, obtained from www.emetro.gr.
Internally, it uses the A* algorithm which uses times as the main search criterion, but adds the geographical position of stations as a heuristic condition to speed up the search. 
The ‘database’ code was generated with excel and python, although it required some craftsmanship given the poor machine accessibility of the Athens metro website.
The stations were modelled as nodes and the connections between them as edges. 




**¿Qué es?**
Programa que permite calcular la ruta óptima entre estaciones del metro de Atenas. 

**¿Cómo se ejecuta?**
Hay un .jar ejecutable
Si se desea compilar en local, la clase ejecutable con el main es "interfazUsuario".

**¿Cómo funciona internamente?**
Tiene en cuenta datos realistas de distancia geográfica entre estaciones, tiempo de trayecto del metro entre estaciones y tiempos de transbordo, obtenidos de www.emetro.gr.
Internamente, utiliza el algoritmo A* que utiliza como principal criterio de búsqueda los tiempos, pero añade como condición heurística para acelerar la búsqueda la posición geográfica de las estaciones. 
El código de la "base de datos" fue generado con excel y python, aunque requirió de una cierta artesanía dada la poca accesibilidad para máquinas de la web del metro de Atenas.
Se modelizaron las estaciones como nodos y las conexiones entre ellas como aristas. 



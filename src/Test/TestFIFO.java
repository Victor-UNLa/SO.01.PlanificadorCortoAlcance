/*------------------------- Algoritmo FIFO-------------------------*/
//  Planificador de corto alcance (PCA)
//
// Es el principal planificador del Sistema Operativo, está continuamente 
// funcionando, es quien decide que proceso pasa a ejecutado, usa distintas 
// políticas o algoritmos, brinda cierta equidad.
// v1.1
// Autor: José Victor Ibáñez
/*------------------------- ------------- -------------------------*/

package Test;

import Model.admProcesamiento;
import Model.Prioridad;
import Model.Tabla;

public class TestFIFO {

	public static void main(String[] args) {

		// *****************************************************************************
		// -Prueba numero 1 del algoritmo FIFO
		admProcesamiento admP1 = new admProcesamiento(20, 35);
		System.out.println("-----------Creando-----------");
		admP1.agregarProceso("P1", 1, 3, 1, 2, Prioridad.Media);
		admP1.agregarProceso("P2", 2, 3, 3, 2, Prioridad.Baja);
		admP1.agregarProceso("P3", 3, 4, 2, 5, Prioridad.Alta);
		admP1.agregarProceso("P4", 6, 1, 1, 1, Prioridad.Media);
		admP1.agregarProceso("P5", 7, 4, 5, 5, Prioridad.Alta);
		admP1.agregarProceso("P6", 8, 1, 3, 1, Prioridad.Media);
		System.out.println(mostrarAlgoritmoFIFO(admP1));

	}

	public static String mostrarAlgoritmoFIFO(admProcesamiento admP) {
		String string = "";
		Tabla[][] tabla = admP.planificarFIFO();
		string += "Algoritmo FIFO";
		string += "\n" + admP.toString(tabla);
		string += "\n" + admP.mostrarProcesos();
		string += "\n-> hay 1 procesador";
		string += "\n-> E/S Se realiza en paralelo\n";
		return string;
	}

}

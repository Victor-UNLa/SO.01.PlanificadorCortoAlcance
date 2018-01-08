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
import Model.admTablaProcesos;
import Model.Prioridad;
import Model.Tabla;

public class TestFIFO {

	public static void main(String[] args) {

		// *****************************************************************************
		admProcesamiento admP1 = new admProcesamiento(20, 38);
		
		admP1.agregarProceso("P1", 1, 3, 1, 2, Prioridad.Media);
		admP1.agregarProceso("P2", 2, 3, 3, 2, Prioridad.Baja);
		admP1.agregarProceso("P3", 3, 4, 2, 5, Prioridad.Alta);
		admP1.agregarProceso("P4", 6, 1, 1, 1, Prioridad.Media);
		admP1.agregarProceso("P5", 7, 4, 5, 5, Prioridad.Alta);
		admP1.agregarProceso("P6", 8, 1, 3, 1, Prioridad.Media);
		
		admTablaProcesos admTP = new admTablaProcesos(admP1);
		System.out.println("-----------Creando FIFO-----------");
		System.out.println(admP1.toString(admP1.planificarFIFO()));
		System.out.println(admTP.mostrarResultados(admP1.planificarFIFO()));
		System.out.println("-----------Creando RoundRobin q=1-----------");
		System.out.println(admP1.toString(admP1.planificarRoundRobin(1)));
		System.out.println(admTP.mostrarResultados(admP1.planificarRoundRobin(1)));
		System.out.println("-----------Creando Prioridades Apropiativos-----------");
		System.out.println(admP1.toString(admP1.planificarPrioridadesApropiativos()));
		System.out.println(admTP.mostrarResultados(admP1.planificarPrioridadesApropiativos()));
		System.out.println("-----------Creando HRRN-----------");
		System.out.println(admP1.toString(admP1.planificarHRRN()));
		System.out.println(admTP.mostrarResultados(admP1.planificarHRRN()));
		
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

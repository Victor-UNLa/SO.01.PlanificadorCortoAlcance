package Test;

import Model.admProcesamiento;
import Model.Prioridad;
import Model.Tabla;

public class TestHRRN {

	public static void main(String[] args) {

		admProcesamiento admP1 = new admProcesamiento(20, 35);
		System.out.println("-----------Creando-----------");
		admP1.agregarProceso("P1", 1, 3, 1, 2, Prioridad.Media);
		admP1.agregarProceso("P2", 2, 3, 3, 2, Prioridad.Baja);
		admP1.agregarProceso("P3", 3, 4, 2, 5, Prioridad.Alta);
		admP1.agregarProceso("P4", 4, 1, 1, 1, Prioridad.Media);
		admP1.agregarProceso("P5", 5, 4, 5, 5, Prioridad.Alta);
		admP1.agregarProceso("P6", 5, 1, 1, 1, Prioridad.Media);
		System.out.println(mostrarAlgoritmoHRRN(admP1));

	}

	public static String mostrarAlgoritmoHRRN(admProcesamiento admP) {
		String string = "";
		Tabla[][] tabla = admP.planificarHRRN();
		string += "Algoritmo HRRN (Primero el de mayor tasa de respuesta)";
		string += "\n" + admP.toString(tabla);
		string += "\n" + admP.mostrarProcesos();
		string += "\n-> hay 1 procesador";
		string += "\n-> E/S Se realiza en paralelo\n";
		return string;
	}

}

package Test;

import Model.admProcesamiento;
import Model.Proceso.Prioridad;

public class TestHRRN {

	public static void main(String[] args) {

		admProcesamiento admP = new admProcesamiento(20, 50);
		System.out.println("-----------Creando-----------");
		admP.agregarProceso("P1", 1, 3, 1, 2, Prioridad.Media);
		admP.agregarProceso("P2", 2, 3, 3, 2, Prioridad.Baja);
		admP.agregarProceso("P3", 3, 4, 2, 5, Prioridad.Alta);
		admP.agregarProceso("P4", 4, 1, 1, 1, Prioridad.Media);
		admP.agregarProceso("P5", 5, 4, 5, 5, Prioridad.Alta);
		admP.agregarProceso("P6", 5, 1, 1, 1, Prioridad.Media);
		System.out.println(admP.mostrarAlgoritmoHRRN());
		
	}

}


package Test;

import Model.Prioridad;
import Model.admProcesamiento;
import Model.admTablaProcesos;

public class TestSPN {

	public static void main(String[] args) {

		admProcesamiento admP1 = new admProcesamiento(20, 38);

		admP1.agregarProceso("P1", 1, 3, 1, 2, Prioridad.Media);
		admP1.agregarProceso("P2", 2, 3, 3, 2, Prioridad.Baja);
		admP1.agregarProceso("P3", 3, 4, 2, 5, Prioridad.Alta);
		admP1.agregarProceso("P4", 6, 1, 1, 1, Prioridad.Media);
		admP1.agregarProceso("P5", 7, 4, 5, 5, Prioridad.Alta);
		admP1.agregarProceso("P6", 8, 1, 3, 1, Prioridad.Media);

		admTablaProcesos admTP1 = new admTablaProcesos(admP1);
		System.out.println("----------- Planificador SPN -----------");
		System.out.println(admP1.mostrarPlanificador(admP1.planificarSPN()));
		System.out.println(admP1.mostrarProcesos() + "\n-> hay 1 procesador" + "\n-> E/S Se realiza en paralelo\n");
		System.out.println("----------- Resultados SPN -----------");
		System.out.println(admTP1.mostrarResultados(admP1.planificarSPN()));

	}

}

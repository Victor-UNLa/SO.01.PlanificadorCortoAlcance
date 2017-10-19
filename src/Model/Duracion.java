package Model;

public class Duracion {

	private int iCPU;
	private int EyS;
	private int fCPU;
	private int tiempoTotal;
	private int tiempoEspera;
	
	public Duracion(int iCPU, int eyS, int fCPU) {
		this.iCPU = iCPU;
		this.EyS = eyS;
		this.fCPU = fCPU;
		this.tiempoTotal = iCPU+fCPU;
		this.tiempoEspera = 0;
	}

	public Duracion() {
		this.iCPU = 0;
		this.EyS = 0;
		this.fCPU = 0;
		this.tiempoTotal = 0;
	}

	public int getiCPU() {
		return iCPU;
	}

	public void setiCPU(int iCPU) {
		this.iCPU = iCPU;
	}

	public int getEyS() {
		return EyS;
	}

	public void setEyS(int eyS) {
		EyS = eyS;
	}

	public int getfCPU() {
		return fCPU;
	}

	public void setfCPU(int fCPU) {
		this.fCPU = fCPU;
	}

	public int getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(int tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}
	
	@Override
	public String toString() {
		return "[CPU=" + getiCPU() + ", E/S=" + getEyS() + ", CPU=" + getfCPU() + "]";
	}

	public int getTiempoEspera() {
		return tiempoEspera;
	}

	public void setTiempoEspera(int tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}
	
	// M�todos
	public void setTiempoEspera() {
		this.tiempoEspera = tiempoEspera+1;
	}
	
}

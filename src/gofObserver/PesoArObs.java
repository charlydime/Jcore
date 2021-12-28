package gofObserver;

public class PesoArObs extends Observador {
	private double tipoCambio = 10.3;
	
	public PesoArObs(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	
	}

	@Override
	public void actualizar() {
	System.out.println("pesoMX " + sujeto.getEstado() * tipoCambio);
	
	}

}

package gofObserver;

public class PesoMxObs extends Observador {
	
		private double tipoCambio = 23.3;
		
		public PesoMxObs(Subject sujeto) {
			this.sujeto = sujeto;
			this.sujeto.agregar(this);
		
		}

		@Override
		public void actualizar() {
			System.out.println("pesoMX " + sujeto.getEstado() * tipoCambio);
	
		}

}

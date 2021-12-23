package graspCreator;

import java.util.ArrayList;


public class Produccion {
	ArrayList<DetalleProduccion> detalles = new ArrayList<>();
	
	
	void agregaDetalleProduccion() {
		detalles.add( new DetalleProduccion());
	}
	
	void eliminaDetalleProduccion(DetalleProduccion d) {
		detalles.remove(d);
	}

}

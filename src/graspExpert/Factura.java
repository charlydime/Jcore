package graspExpert;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
	Cliente cliente;
	Date Fecha;
	ArrayList<Detalles> detalles = new ArrayList<>();
	
	void crearCliente() {
		cliente = new Cliente();
	};
	void agregaDetalle(Detalles d) {
		detalles.add(d);
	}
	void eliminaDetalle(Detalles d) {
		detalles.remove(d);
	}

}

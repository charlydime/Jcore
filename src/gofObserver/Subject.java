package gofObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observador> observadores = new ArrayList<>();
	private int estado;
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
		notifyALL();
	}
	
	private void notifyALL() {
		observadores.forEach(x -> x.actualizar());
		
	}

	public void agregar (Observador obs) {
		observadores.add(obs);
	} 
	
	
	
	
	
	

}

package gofCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<IOperacion> operaciones = new ArrayList<>();
	
	public void recibirOperacion(IOperacion operacion) {
		this.operaciones.add(operacion);
	}

	public void realizarOperacion() {
		this.operaciones.forEach( x -> x.ejecuta() );
		this.operaciones.clear();
	}
}

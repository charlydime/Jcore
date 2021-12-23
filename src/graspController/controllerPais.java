package graspController;

import java.util.ArrayList;

public class controllerPais {

	ArrayList<String> paises = new ArrayList<>();
	void despachador(String evento,String pais){
				
		switch (evento) {
		case "lista":
			listar();
			break;
		case "agregar":
			agregar(pais);
			break;
		case "eliminar":
			eliminar(pais);
			break;

		default:
			break;
		}
		
	}
	
	void agregar(String pais) {
		paises.add(pais);			
	}
	
	void listar() {
		
		paises.stream().forEach( pais -> System.out.println(pais) );
		
	}
	
	void eliminar(String pais) {
		paises.remove(pais);
	}
	
}

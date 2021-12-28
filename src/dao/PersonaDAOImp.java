package dao;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImp implements PersonaDAO {

	@Override
	public List<Persona> listarTodos() {
		List<Persona> lista = new ArrayList<>();
		
		Persona per = new Persona();
		per.setId(1);
		per.setNombres("Mito");
		
		lista.add(per);
		
		per = new Persona();
		per.setId(2);
		per.setNombres("holamundo");
		
		lista.add(per);
		
		per = new Persona();
		per.setId(3);
		per.setNombres("hdeLeon");
		
		lista.add(per);
		
		return lista;
	}

	@Override
	public Persona one(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void news(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Persona persona) {
		// TODO Auto-generated method stub
		
	}
	

}

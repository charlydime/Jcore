package dao;

import java.util.List;

public interface PersonaDAO {
	
	List<Persona> listarTodos();
	Persona one(int id);
	void news(Persona persona);
	void update(Persona persona);
	void delete(Persona persona);

}

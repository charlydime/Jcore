package dao;

public class App {
	public static void main(String[] args) {
		PersonaDAO dao = new PersonaDAOImp();
		dao.listarTodos().forEach(x-> System.out.println(x.getNombres()));
	}
}

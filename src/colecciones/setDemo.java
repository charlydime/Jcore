package colecciones;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class setDemo {
	
	public static <T> void   listar(Collection<T> c) {
		
		c.forEach(elem -> { System.out.println( elem ); });
		
	}
	public static void main(String[] args) {
		Set<String> con = new HashSet<>() ;
		
		con.add("Juan");
		con.add("Marcelino");
		con.add("Margarito");
		con.add("Mario");
		con.add("Mario"); // no repite elementos
		
		listar(con);
		
	}

}

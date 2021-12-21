package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecorreArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> plus = List.of("plus1","plus2","plus3");
		list.add("Martes");
		list.add("Lunes");
		list.add("Miercoles");
		list.add("Sabado");
		list.add("Sabado"); // repite elementos
		list.addAll(plus); // inserta colecciones
		
		System.out.println("listado");
		list.forEach( elem -> {
			System.out.println(elem);
		});

		
		System.out.println("listado2");
		for( String e : list) {
			System.out.println(e);
		}

		System.out.println("listado3");
		Iterator<String> listIterator = list.iterator();
		
		while (listIterator.hasNext()){
			
			System.out.println(listIterator.next());
		}
		
	}

}

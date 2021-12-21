package colecciones;

import java.util.ArrayList;

public class EjercicioArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new  ArrayList<String> ();
		list.add("compu");
		list.add("raton");
		list.add("monitor");
		list.add("memoria usb");
		list.add("CPU");
		
		
		System.out.println(list);
		list.add(2,"cables");
		System.out.println(list);
		list.set(3,"monitor led");
		System.out.println(list);
		System.out.println(list.size());
		
		boolean res = list.contains("CPU");
		System.out.println("CPU existe? "+ res);
		
		System.out.println(" en que posicion esta CPU " + list.lastIndexOf("CPU"));
		
		list.remove(0);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		
		
		

	}

}

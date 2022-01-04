package inmutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		InmutableCls inmutable = new InmutableCls("Momia", 1);
		
		System.out.println( inmutable.getNombre() );
		
		//colleccion inmutable
	      String strArray[] = {"Pedro", "Fernando", "Yamir", "Julio", "Antonio"};

	      List<String> list = Arrays.asList(strArray);

	      //Convertiendo a  immutable
	      List<String> immu = Collections.unmodifiableList(list); 
	      System.out.println(immu);
	      immu.add("Juan");
		
	}
}

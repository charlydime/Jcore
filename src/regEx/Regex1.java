package regEx;

import java.util.regex.Pattern;

public class Regex1 {
	public static void main(String[] args) {
		
		 String patron; 
		 String texto; 
		 
		 patron = "[0-9]+"; // un numero o  mas
		 texto = "uno1dos2tres3cuatro4cinco";
		 
		 Pattern p1 = Pattern.compile(patron);
		 
		 String[] items = p1.split(texto);
		 for( String s : items) {
			 System.out.println(s);
		 }
	}

}

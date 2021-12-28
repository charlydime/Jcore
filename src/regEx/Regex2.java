package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
	public static void main(String[] args) {
		
		 String patron; 
		 String texto; 
		 
		 patron = "a[mp]"; // buscar una  a seguida de un caracter m o p
		 texto = "Estamos aprendiendo a usar RegEx";
		 
		 Pattern p1 = Pattern.compile(patron);
		 
		 Matcher mat = p1.matcher(texto);
		 
		 String res = mat.replaceAll("x");// remplaza por x  lo que encontro  con la regex
		 
		 System.out.println(res);
		 
	}
}

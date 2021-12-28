package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
	
	public static void main(String[] args) {
		
		
		String cadena = "alex joel";
		
		Pattern pat = Pattern.compile("^alex.*");
		Matcher mat = pat.matcher(cadena);
		
		if(mat.matches()) {
			System.out.println("ok");
		}else {
			System.out.println("NO ok");
		}
		
		
	}

}

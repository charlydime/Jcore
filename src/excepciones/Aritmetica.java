package excepciones;

public class Aritmetica {
 public static int div (int  num , int den) throws OperacionExcepcion  { 
	 if (den == 0) {
		 
		 throw new OperacionExcepcion("Div entre ZERO!!!");
		 
		
	}
	 return num / den; }
 
 
}

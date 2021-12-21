package excepciones;

public class numerica {
	public static void main(String[] args) {
		int res = 0;
		try {
			
			res = 0/0; 
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("algo salio mal "+ e.toString());
			
			
		}
				
		 System.out.println("resultado "+ res);
		 
		 try {
				
				res = Aritmetica.div(10,0);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("algo salio mal "+ e.getMessage());
				
				
			}
		
	}

}

package valorRef;

public class Referencia {
	
	public static class Persona {
		
		public String nombre;
		public String telefono;
		
		public Persona(String nom, String tel) {
			 this.nombre = nom ;
					  this.telefono = tel; 
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona i = new Persona("Carlos R", "33456789");
		Persona j = new Persona("Rocio M", "339875634");
		Persona iRef = i;
		System.out.println(i.nombre);
		System.out.println(iRef.nombre);
		System.out.println(j.nombre);
		
		i.nombre = "Carlos Rojo"; 

		System.out.println(i.nombre);
		System.out.println(iRef.nombre);

		

	}

}

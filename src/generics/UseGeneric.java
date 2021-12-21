package generics;

public class UseGeneric {

	public static void main(String[] args) {
		
		Generica<String> nob = new Generica<>();
		nob.setDato("hola");
		System.out.println( nob.getDato() );
	}
}

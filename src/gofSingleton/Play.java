package gofSingleton;

public class Play {
	
	public static void main(String[] args) {
		Conexion con = Conexion.getInstancia();
		
		System.out.println("Esta instanciada conexion ?" );
		System.out.println( con instanceof Conexion );
		System.out.println( con.hashCode() );
		
		Conexion con2 = Conexion.getInstancia();
		System.out.println("Esta instanciada conexion ?" );
		System.out.println( con2 instanceof Conexion );
		System.out.println( con2.hashCode() );
		
		
	}

}

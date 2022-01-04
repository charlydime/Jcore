package functionalInt;

public class App {
	public static void main(String[] args) {
		
		PuebaFuncInt fun = (String x) -> {
			System.out.println(x);
		};
		
		fun.ejecuta("hola");
		
	}
}

package gifStrategy;

public class App {
	
	public static void main(String[] args) {
		System.out.println("--------------av simple---------------------------");
		Contexto contexto = new Contexto(new AvSimple());
		contexto.ejecutar();
		System.out.println("--------------av avanzado---------------------------");
		contexto = new Contexto(new AvAvanzado());
		contexto.ejecutar();
	}

}

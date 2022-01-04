package threadyield;

public class App {
	
	public static void main(String[] args) {
		HiloYield hilo = new HiloYield();
		
		Thread hilo1 = new Thread(hilo, "hilo-1");
		hilo1.start();
		Thread hilo2 = new Thread(hilo, "hilo-2");
		hilo2.start();
	}

}

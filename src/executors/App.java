package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		int cpu = Runtime.getRuntime().availableProcessors();
		
		ExecutorService service = Executors.newFixedThreadPool(cpu);
		
		for (int i = 0; i < 100; i++) {
			service.execute(new Task() );
			
		}
		System.out.println("Thread " + Thread.currentThread().getName() );
		System.out.println("CPU " + cpu );
		
	}

}

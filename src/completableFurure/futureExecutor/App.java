package completableFurure.futureExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

	public static void main(String[] args) {
		
		ExecutorService srv = Executors.newFixedThreadPool(10);
		
		Future<Integer> fut = srv.submit(new Task());
		
		Integer res;
		try {
			res = fut.get();
			System.out.println("Resultado de la tarea "+ res);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //block
		

	}

}

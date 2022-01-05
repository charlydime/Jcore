package completableFurure.Order;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class App {
	
	public static void soloPrincipal() {
		Order orden = new  Order();
		
		System.out.println(" sin hilo(por principal) ");
		orden
			.ordenar()
			.pagar()
			.despachar()
			.notificaMail();
		
	}
	
	public static void megaThreadPool() {
		OrderX orden = new  OrderX();
		
		ExecutorService srv = Executors.newFixedThreadPool(4);
		
		System.out.println(" hilos con CompletableFuture ");
		
		CompletableFuture
			.supplyAsync( orden.ordenar()  ,srv )
			.thenApplyAsync( order -> orden.pagar() , srv)
			.thenApplyAsync( order -> orden.despachar() , srv )
		;
					
		
	}
	
	

	public static void main(String[] args) {
		
		soloPrincipal();
		megaThreadPool();
		

	}

}

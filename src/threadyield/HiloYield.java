package threadyield;

public class HiloYield implements Runnable {

	@Override
	public void run() {
		System.out.println("Running : "+ Thread.currentThread().getName());
		
		for (int i = 0; i < 10 ; i++) {
			
			System.out.println(" task "+ i + " by " +Thread.currentThread().getName());
			
			if(i==5) Thread.yield();
			
		}

	}

}

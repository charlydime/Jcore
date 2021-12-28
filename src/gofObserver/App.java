package gofObserver;

public class App {
	
	public static void main(String[] args) {
		Subject sub = new Subject();
		
		
		new PesoArObs(sub);
		new PesoMxObs(sub);
		
		sub.setEstado(10);
		sub.setEstado(100);
	}

}

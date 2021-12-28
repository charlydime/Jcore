package gofMemento;

public class App {
public static void main(String[] args) {
	String nombreJuego = "Contra III";
	
	Juego juego = new Juego();
	juego.setNombre(nombreJuego);
	juego.setCheckPoint(1);
	
	CareTaker caretaker = new CareTaker();
	Originator originator = new Originator();
	
	juego = new Juego();
	juego.setNombre(nombreJuego);
	juego.setCheckPoint(2);
	originator.setEstado(juego);
	
	juego = new Juego();
	juego.setNombre(nombreJuego);
	juego.setCheckPoint(3);
	originator.setEstado(juego);
	
	caretaker.addMemento(originator.guardar()); // estado  pos 0
	
	juego = new Juego();
	juego.setNombre(nombreJuego);
	juego.setCheckPoint(4);
	originator.setEstado(juego);
	
	caretaker.addMemento(originator.guardar()); // estado  pos 1
	
	juego = new Juego();
	juego.setNombre(nombreJuego);
	juego.setCheckPoint(5);
	originator.setEstado(juego);
	originator.restaurar(caretaker.getMemento(4));
	
	juego =originator.getEstado();
	System.out.println(juego);
	
	
	
	
}
}

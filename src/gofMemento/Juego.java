package gofMemento;

public class Juego {

	private String nombre;
	
	private int checkPoint;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCheckPoint() {
		return checkPoint;
	}
	public void setCheckPoint(int checkPoint) {
		this.checkPoint = checkPoint;
	}
	
	public String toString() {
		return "juego "+ nombre + ", point "+ checkPoint;
	} 
	
}

package inmutable;

public class InmutableCls {
	
	private String nombre;
	private int id;
			
	public InmutableCls(String nombre, int i) {
		
		this.nombre = nombre;
		this.id = i;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getId() {
		return id;
	}
	// clases inmutables no tienen setters , todo se setea en el constructor
	

}

package graspExpert;

public class Detalles {
	Integer unidades; 
	Producto producto;
	Integer total; 
	
	void agregarProducto(Producto prod){
		this.producto = prod;
		
	}
	Integer calculaTotal() {
		return unidades * producto.cantidad;
	}
	

}

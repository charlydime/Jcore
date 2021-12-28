package generics;

public class Numeric<T extends Number> {
	
	T ob;
	public Numeric(T ob) {
		this.ob = ob;
		}
	
	double cuadrado() {
		return ob.intValue() * ob.doubleValue();
	}

}

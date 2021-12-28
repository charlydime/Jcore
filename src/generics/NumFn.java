package generics;

public class NumFn<T extends Number> {
	
	T num;
	
	public NumFn(T ob) {
		this.num = ob ;
	 
	}
	
	boolean absEqual(NumFn<?> ob ) {
		
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		
	return false;
	}

}

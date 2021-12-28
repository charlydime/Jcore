package generics;

public class Genclass<T,V> {
	T ob;
	V ob2;
	
	Genclass(T ob,V ob2){
		this.ob= ob;
		this.ob2 = ob2;
		
	}
	
	void showType() {
		System.out.println(ob.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}

}

package tuplas;
import java.util.Objects;
import java.util.function.Function;

public class Tupla<T1,T2> {
	
	public final T1 t1;
	public final T2 t2;
	
	private Tupla(T1 t1, T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public static <T1,T2> Tupla<T1,T2> of (T1 t1, T2 t2){
		Objects.requireNonNull(t1);
		Objects.requireNonNull(t2);
		
		return new Tupla<>(t1,t2);
	} 
	
	public <R> Tupla<R,T2> aplicaEn1(Function<T1,R> func){
		Objects.requireNonNull(func);
		return Tupla.of(func.apply(t1), t2);
	}
	
	public <R> Tupla<T1,R> aplicaEn2(Function<T2,R> func){
		Objects.requireNonNull(func);
		return Tupla.of( t1 , func.apply(t2));
	}
	
	

}

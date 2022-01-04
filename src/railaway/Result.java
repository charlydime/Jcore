package railaway;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class Result<S,F>{
	private Result() {}
	/**	
	public abstract <R> R either(Function<S,R> onSuccess, Function<F,R> inFail);
	
	//public Result<S1,F> map (Function<S,S1> f){	}
	static <S,S1, F> Function<Result<S,F>,Result<S1,F>> onSuccess(
	  Function<S,S1> f
	){
		return r-> r.either( 
				success -> Result.success(f.apply(success)), 
				failure -> Result.failure(failure)
				);
	}
	
	static <S,S1, F> Function<Result<S,F>,Result<S,F1>> onFailure(
			  Function<F,F1> f
			){
				return r-> r.either( 
						success -> Result.success(sucess), 
						failure -> Result.failure(f.apply(success))
						);
			}
	
	//public Result<S1,F> flatmap (Function<S,Result<S1,F>> f){	}
	static <S,S1, F> Function<Result<S,F>,Result<S1,F>> attempt(
			  Function<S,Result<S1,F>> f
			){
				return r-> r.either( 
						success -> f.apply(sucess), 
						failure -> Result.failure(failure)
						);
			}
	
	static <S,F,F1> Function<Result<S,F>,Result<S,F1>> onFailure(
			Function<F,F1> f
			){
		return r -> r.either(
				success -> Result.sucesss(success),
				failure -> Result.failure(f.apply(failure))
				);
	}
	
	//public S ifFail(Function<F,S> f) {return null;}
	static <S,F> Function<Result<S,F>,S> ifFailed(
			Function<F,S> f
			){
		//return r -> r.either(identity(), f);
		return r-> r.either(
				success -> success, 
				failure -> f.apply(failure)
				);
	}
	
	static <S,F> Function<Result<S,F>,Stream<S>> successes(){
		return r-> r.either( 
				success -> Stream.of(success), 
				failure -> Stream.empty()
				);
	}
	
	
	
	static <S,F> Function<Result<S,F>, Result<S,F>> onFailureDo_old(Consumer<F> f){
		return r -> r.either( 
				success -> Result.success(success), 
				failure -> {
					f.accept(failure);
					Result.failure(failure);
				});
	}
	
	static <T> Function<T,T> peek(Consumer<T> f){
		return t->{
			f.accept(t);
			return t;
		};
	}
	
	static <S,F> Function<Result<S,F>, Result<S,F>> onFailureDo_old2(Consumer<F> f){
		return r -> r.either( 
				success -> Result.success(success), 
				failure -> Result.failure(peek(f).apply(failure)
						);
				
	}
	
	static <S,F> Function<Result<S,F>, Result<S,F>> onFailureDo(Consumer<F> f){
		return onFailure(peek(f));
	}
	
	
	
	public <R> R then(Function<Result<S,F>,R> f) {
		return f.apply(this);
	} 
	
	
	public static class Success<S,F> extends Result<S,F>{
		private final S value;
		public Success(S value) { this.value = value; }
	}
	
	public static class Failure<S,F> extends Result<S,F>{
		private final F value;
		public Failure(F value) { this.value = value; }
	}
	**/
}

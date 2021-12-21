package recursivo;

public class Recur {
	
	public static int sum (int n) {
		
		if(n<=1) {
			System.out.println( "ultimo" );
			return 1;
		}else {
			System.out.println( "Recursion de "+ n );
			return n+sum(n-1);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( sum(6) );

	}

}

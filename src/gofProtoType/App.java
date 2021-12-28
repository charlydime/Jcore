package gofProtoType;

public class App {
	
	public static void main(String[] args) {
		
		CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
		
		CuentaAHImpl cuentaClon = (CuentaAHImpl) cuentaAhorro.clonar();
		
		if(cuentaClon != null) {
			System.out.println(cuentaClon);
		}
		
		System.out.println(  cuentaAhorro == cuentaClon) ;
		
	}

}

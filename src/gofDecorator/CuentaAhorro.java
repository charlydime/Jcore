package gofDecorator;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("cuenta ahorro nueva");
		
	}
	

}

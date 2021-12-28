package gofDecorator;



public class CuentaCredito implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("Cuenta de credito");
		
	}

	

}

package gofDecorator;

public class CuentaDecorator implements ICuentaBancaria {
	
	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorator(ICuentaBancaria cuentasimple) {
		this.cuentaDecorada=  cuentasimple;
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
		
	}
	

}

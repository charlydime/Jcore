package gofDecorator;

public class BlindajeDecorador extends CuentaDecorator {

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
		
	}

	private void agregarBlindaje(Cuenta c) {
		System.out.println("cuenta blindada");
		
	}

}

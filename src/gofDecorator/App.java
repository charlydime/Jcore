package gofDecorator;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1,"yo mero");
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		cuentaBlindada.abrirCuenta(c);

	}

}

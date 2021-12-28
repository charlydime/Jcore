package gofProxy;

public class CuentaBancoImp implements ICuenta {

	@Override
	public Cuenta retiraDinero(Cuenta cuenta, double monto) {
		 double saldoActual = cuenta.getSaldoIni() - monto;
		 cuenta.setSaldoIni(saldoActual);
		 mostrarSaldo(cuenta);
		return cuenta;
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoIni() + monto;
		 cuenta.setSaldoIni(saldoActual);
		 mostrarSaldo(cuenta);
		return cuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		
		System.out.println("Saldo: "+ cuenta.getSaldoIni());
	}

}

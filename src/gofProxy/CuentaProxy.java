package gofProxy;

public class CuentaProxy implements ICuenta{
	
	private CuentaBancoImp cuentaReal;

	@Override
	public Cuenta retiraDinero(Cuenta cuenta, double monto) {
		if(cuentaReal == null) {
			cuentaReal = new CuentaBancoImp();
			return cuentaReal.retiraDinero(cuenta, monto);
		}else {
			return cuentaReal.retiraDinero(cuenta, monto);
		}
	}

	@Override
	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		if(cuentaReal == null) {
			cuentaReal = new CuentaBancoImp();
			return cuentaReal.depositarDinero(cuenta, monto);
		}else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		if(cuentaReal == null) {
			cuentaReal = new CuentaBancoImp();
			 cuentaReal.mostrarSaldo(cuenta);
		}else {
			 cuentaReal.mostrarSaldo(cuenta);
		}
		
	}
	

}

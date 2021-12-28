package gofCommand;
//comando dos
public class DepositarImpl implements IOperacion{

	private Cuenta cuenta;
	private double monto;
	
	public DepositarImpl(Cuenta cuenta, double monto) {
		this.cuenta = cuenta; 
		this.monto = monto;
	}
	
	
	@Override
	public void ejecuta() {
		
		this.cuenta.depositar(this.monto);
		
		
	}
	

}

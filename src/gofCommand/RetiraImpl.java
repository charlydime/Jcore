package gofCommand;
//comando uno
public class RetiraImpl implements IOperacion{

	private Cuenta cuenta;
	private double monto;
	
	public RetiraImpl(Cuenta cuenta, double monto) {
		this.cuenta = cuenta; 
		this.monto = monto;
	}
	
	
	@Override
	public void ejecuta() {
		
		this.cuenta.retira(this.monto);
		
		
	}
	

}

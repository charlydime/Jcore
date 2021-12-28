package gofCommand;



public class App {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1,200);
		
		DepositarImpl opDep =  new DepositarImpl(cuenta,100);
		RetiraImpl opRet = new RetiraImpl(cuenta, 50);
		
		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDep);
		ivk.recibirOperacion(opRet);
		
		ivk.realizarOperacion();
	}

}

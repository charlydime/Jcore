package graspProtectedVariations;

public class PaymentProcesorBankImp implements PaymentPRocessor {

	Bank myapi;
	public PaymentProcesorBankImp(Bank banckAPI) {
		myapi = banckAPI;
		
	}

	@Override
	public void pay() {
		
		myapi.charge();
		
	}
	
	

}

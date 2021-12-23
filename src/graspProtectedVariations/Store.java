

package graspProtectedVariations;

public class Store {
	
	protected PaymentPRocessor bankAPI;

	public Store(PaymentPRocessor bankAPI) {
	
		this.bankAPI = bankAPI;
		
	}
	
	public void purchase() {
		this.bankAPI.pay();
	}
	
	
	

}


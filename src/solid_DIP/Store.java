package solid_DIP;

public class Store {
	
	protected Bank bankAPI;

	public Store(Bank bankAPI) {
	
		this.bankAPI = bankAPI;
		
	}
	
	public void purchase() {
		this.bankAPI.charge();
	}
	
	
	

}
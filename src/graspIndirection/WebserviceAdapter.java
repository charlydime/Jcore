package graspIndirection;

public class WebserviceAdapter implements Webservice{
	
	Titulo titulo ;
	public WebserviceAdapter() {
		titulo = new Titulo();
	}
	
	public void envia() {
		
		System.out.println(titulo.toString());
		System.out.println("enviado!!");
	}

	public void cancela() {
		
		System.out.println(titulo.toString());
		System.out.println("cancelacion enviada!!");
	}
	
}

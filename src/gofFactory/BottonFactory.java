package gofFactory;

public class BottonFactory {
	
	public Iboton getButton(String plataforma ) {
		
		if(  plataforma.equalsIgnoreCase("Android")) return new BtnAndriod();
		if(  plataforma.equalsIgnoreCase("IOS")) return new BtnIOS();
		
		return null;
		
		
	}

}

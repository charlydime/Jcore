package gofAbtractFactory;

public class FrameFactory {
	
	Iframe getFrame(String plataforma) {
		
		if(  plataforma.equalsIgnoreCase("Android")) return new FrameAndroid();
		if(  plataforma.equalsIgnoreCase("IOS")) return new FrameIOS();
		
		return null;
		
		
	}

}

package gofAbtractFactory;

public class InterfaceAbtractFactory {
	FrameFactory frames;
	BottonFactory buttons;
	
	public InterfaceAbtractFactory(){
		frames = new FrameFactory();
		buttons = new BottonFactory();
				
	}
	
	public FrameFactory getFrames() {
		return frames;
	}
	
	public BottonFactory getButtons() {
		return buttons;
	}
	
	
	

}

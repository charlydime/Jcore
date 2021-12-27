package gofFactory;

public class Play {

	public static void main(String[] args) {
		
		BottonFactory botonMaker = new BottonFactory();
		
		Iboton bt1 = botonMaker.getButton("android");
		bt1.pinta();
		System.out.println(bt1 instanceof BtnAndriod);
		
		
		Iboton bt2 = botonMaker.getButton("IOS");
		bt2.pinta();
		System.out.println(bt2 instanceof BtnIOS);
	}

}

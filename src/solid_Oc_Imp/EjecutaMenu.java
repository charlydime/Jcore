package solid_Oc_Imp;

import java.util.ArrayList;

public class EjecutaMenu {

	public static void main(String[] args) {
		ArrayList<String> menu = new ArrayList<>();
		
		 Menu obj = new Menu ();
		 obj.out(menu);
		 
		 MenuHtml obj2 = new MenuHtml();
		 obj2.out(menu);

	}

}

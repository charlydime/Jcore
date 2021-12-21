package solid_Oc_Imp;

import java.util.ArrayList;

public class MenuHtml implements MenuOut{

	@Override
	public void out(ArrayList<String> menu) {
		System.out.println("<ul> "  );
		for ( String e : menu) {
			System.out.println("<li>" + e + "</li>" );
		}
		System.out.println("</ul> "  );
		
	}
	
	
	
	 

}

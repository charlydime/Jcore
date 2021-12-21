package solid_Oc_Imp;

import java.util.ArrayList;

public class Menu implements MenuOut
{
	
	
	@Override
	public void out(ArrayList<String> menu) {
		
		for ( String e : menu) {
			System.out.println("item 1 " + e );
		}
		
	} 
	

}

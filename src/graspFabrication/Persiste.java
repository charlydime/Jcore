package graspFabrication;

import java.util.ArrayList;

public class Persiste {
	
	Transporte transporte;
	
	ArrayList<Transporte> transporteDB = new ArrayList<>();
	
	void salvaTransportedb(Transporte t) {
		
		transporteDB.add(t);
		
		
	}

}

package colecciones;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
				
		Map<String,String> mapa = new HashMap<>();
		
		mapa.put("k1","mex");
		mapa.put("k2","usa");
		mapa.put("k3","per");
		
		System.out.print(mapa.keySet() ) ;
		
		mapa.remove("k3");
		
		setDemo.listar(mapa.keySet());
		setDemo.listar(mapa.values());
		
		

	}

}

package solid_Iseg_Imp;

public class pato implements PuedeVolar,Puedeflotar,Play{
	@Override
	public void flota() {
		System.out.println("Todos flotan");
	}

	@Override
	public void vuelavuela() {
		System.out.println("Pato Vuela Vuela");
		
	}

	@Override
	public void play() {
		 this.vuelavuela();
		 this.flota();
		
	}

}

package solid_Iseg_Imp;

public class PatoMadera implements Puedeflotar,Play{
	@Override
	public void flota() {
		System.out.println("Todos flotan");
	}

	@Override
	public void play() {
		this.play();
		
	}

}

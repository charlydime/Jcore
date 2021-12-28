package gifStrategy;

public class AvSimple extends AnalisisSimple {

	@Override
	void stop() {
		System.out.println("Av simple stop");

	}

	@Override
	void noZip() {
		System.out.println("Saltando  archivos zip");

	}

	@Override
	void init() {
		System.out.println("Av simple start");

	}

}

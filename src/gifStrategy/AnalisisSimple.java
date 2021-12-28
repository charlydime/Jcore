package gifStrategy;

public abstract class AnalisisSimple implements IEstrategia {

	@Override
	public void analizar() {
		init();
		noZip();
		stop();

	}

	abstract void stop();
	abstract void noZip();
	abstract void init();

}

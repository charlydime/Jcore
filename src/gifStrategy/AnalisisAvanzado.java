package gifStrategy;

public abstract class AnalisisAvanzado implements IEstrategia {

	@Override
	public void analizar() {
		init();
		scanMem();
		scanKeyloggers();
		scanRootkits();
		unzip();
		stop();

	}
	abstract void init();
	abstract void scanMem();
	abstract void scanKeyloggers();
	abstract void scanRootkits();
	abstract void unzip();
	abstract void stop();

}

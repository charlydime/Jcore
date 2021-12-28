package gifStrategy;

public class AvAvanzado extends AnalisisAvanzado {

	@Override
	void init() {
		System.out.println("Av avanzado stop");

	}

	@Override
	void scanMem() {
		System.out.println("Av mem scan");

	}

	@Override
	void scanKeyloggers() {
		System.out.println("look for keyloggers");

	}

	@Override
	void scanRootkits() {
		System.out.println("look for rootkits");

	}

	@Override
	void unzip() {
		System.out.println("scan zips"); 

	}

	@Override
	void stop() {
		// TODO Auto-generated method stub

	}

}

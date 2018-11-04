package pl.andrzejszywala.oop.lsp2;

public class LSP {

	public static void main(String[] args) {
		startuj(new Orzel());
	}

	private static void startuj(LatajacyPtak ptak) {
		ptak.lec();
	}
	
}

class Ptak {
}

class LatajacyPtak extends Ptak {
	public void lec() {
		
	}
}

class Orzel extends LatajacyPtak {
	
}

class Strus extends Ptak {

}


package pl.andrzejszywala.oop.lsp;

public class LSP {

	public static void main(String[] args) {
		startuj(new Orzel());
		startuj(new Strus());
	}

	private static void startuj(Ptak ptak) {
		if (ptak instanceof Strus) {
			System.out.println("Strusie nie latają :(");
		} else {
			ptak.lec();
		}
	}
	
}

class Ptak {
	public void lec() {		
	}
}

class Orzel extends Ptak {
	
}

class Strus extends Ptak {

}


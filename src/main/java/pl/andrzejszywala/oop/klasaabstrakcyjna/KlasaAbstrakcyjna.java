package pl.andrzejszywala.oop.klasaabstrakcyjna;

public class KlasaAbstrakcyjna {

	public static void main(String[] args) {
		new BMW().wlacz();
		new Mercedes().wlacz();
	}
	
}

abstract class Pojazd {
	
	public void wlacz() {
		System.out.println("Włączam pojazd");
	}
}

abstract class Samochod extends Pojazd {
	
	public void wlacz() {
		super.wlacz();
		System.out.println("Włączam samochod");
	}
}

class BMW extends Samochod {
	
	public void wlacz() {
		super.wlacz();
		System.out.println("Włączam BMW");
	}
}

class Mercedes extends Samochod {
	
	public void wlacz() {
		System.out.println("Włączam Mercedesa");
	}
}
package pl.andrzejszywala.oop.dziedziczenie;

public class Dziedziczenie {

	public static void main(String[] args) {
		new BMW().wlacz();
		new Mercedes().wlacz();
	}
	
}

class Pojazd {
	
	public void wlacz() {
		System.out.println("Włączam pojazd");
	}
}

class Samochod extends Pojazd {
	
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
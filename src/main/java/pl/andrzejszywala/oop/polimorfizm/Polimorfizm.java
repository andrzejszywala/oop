package pl.andrzejszywala.oop.polimorfizm;

public class Polimorfizm {
	public static void main(String[] args) {
		Pojazd pojazd = new BMW();
		pojazd.wlacz();
		pojazd = new Mercedes();
		pojazd.wlacz();
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
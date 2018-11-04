package pl.andrzejszywala.oop.ocp2;

public class OCP {

	public static void main(String[] args) {
		new Osoba("Andrzej", "Nowak", "PL", "43-173", new WalidatorPL());
		new Osoba("John", "Doe", "US", "54897", new WalidatorUS());
		new Osoba("Enrico", "Khel", "DE", "123", new WalidatorDE());
	}
	
}

class Osoba {
	private String imie;
	private String nazwisko;
	private String kodPocztowy;
	private String kraj;
	private WalidatorKoduPocztowego walidatorKoduPocztowego;
		
	public Osoba(String imie, String nazwisko, String kraj, String kodPocztowy, WalidatorKoduPocztowego walidatorKoduPocztowego) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kraj = kraj;
		this.kodPocztowy = kodPocztowy;
		this.walidatorKoduPocztowego = walidatorKoduPocztowego;
		walidatorKoduPocztowego.waliduj(kodPocztowy);
	}

}

interface WalidatorKoduPocztowego {
	void waliduj(String kodPocztowy);
}

class WalidatorPL implements WalidatorKoduPocztowego {

	@Override
	public void waliduj(String kodPocztowy) {
		if (!kodPocztowy.matches("\\d{2}-\\d{3}")) {
			throw new IllegalArgumentException("Kod pocztowy powinien mieć format \\\\d{2}-\\\\d{3}");
		}
	}
}

class WalidatorUS implements WalidatorKoduPocztowego {

	@Override
	public void waliduj(String kodPocztowy) {
		if (!kodPocztowy.matches("^\\d{5}$")) {
			throw new IllegalArgumentException("Kod pocztowy powinien mieć format ^\\\\d{5}$");
		}
	}
}

class WalidatorDE implements WalidatorKoduPocztowego {

	@Override
	public void waliduj(String kodPocztowy) {
		if (!kodPocztowy.matches("^\\d{3}$")) {
			throw new IllegalArgumentException("Kod pocztowy powinien mieć format ^\\\\d{3}$");
		}
	}
}


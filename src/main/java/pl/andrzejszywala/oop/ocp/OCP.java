package pl.andrzejszywala.oop.ocp;

public class OCP {

	public static void main(String[] args) {
		new Osoba("Andrzej", "Nowak", "PL", "43-173");
		new Osoba("John", "Doe", "US", "54897");
		new Osoba("Enrico", "Khel", "DE", "54897");
	}
	
}

class Osoba {
	private String imie;
	private String nazwisko;
	private String kodPocztowy;
	private String kraj;
		
	public Osoba(String imie, String nazwisko, String kraj, String kodPocztowy) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kraj = kraj;
		this.kodPocztowy = kodPocztowy;
		walidujKodPocztowy(kodPocztowy);
	}

	private void walidujKodPocztowy(String kodPocztowy) {
		if ("PL".equals(kraj) && kodPocztowy.matches("\\d{2}-\\d{3}")) {
			return;
		} else if ("US".equals(kraj) && kodPocztowy.matches("^\\d{5}$")) {
			return;
		}
		throw new IllegalArgumentException("Niepoprawny kod pocztowy");
	}
}

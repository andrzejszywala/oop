package pl.andrzejszywala.oop.hermetyzacja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Hermetyzacja {

	public static void main(String[] args) {
		KomunikatyWalidacji komunikaty = new KomunikatyWalidacji();
		komunikaty.dodajBlad("Brak wartości pola nazwa");
		komunikaty.dodajBlad("Niepoprawna liczba");
		komunikaty.dodajOstrzezenie("Drugie imię powinno być wypełnione");
		
		System.out.println(komunikaty.ostrzezenia());
		System.out.println(komunikaty.bledy());
	}
	
}

class KomunikatyWalidacji {
	private Collection<KomunikatWalidacji> komunikaty = new ArrayList<>();
	
	public void dodajBlad(String tresc) {
		komunikaty.add(new KomunikatWalidacji(1, tresc));
	}
	
	public void dodajOstrzezenie(String tresc) {
		komunikaty.add(new KomunikatWalidacji(2, tresc));
	}
	
	public String ostrzezenia() {
		return "Ostrzeżenia:\n" +komunikatyJakoTekst(2);
	}

	
	public String bledy() {
		return "Błędy:\n" + komunikatyJakoTekst(1);
	}

	private String komunikatyJakoTekst(int poziom) {
		return komunikaty.stream()
				.filter(k -> k.poziom == poziom)
				.map(k -> k.tresc)
				.collect(Collectors.joining("\n"));
	}
}

class KomunikatWalidacji {
	int poziom;
	String tresc;

	public KomunikatWalidacji(int poziom, String tresc) {
		super();
		this.poziom = poziom;
		this.tresc = tresc;
	}

	@Override
	public String toString() {
		return tresc;
	}
}

package pl.andrzejszywala.oop.srp2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SRP {

	public static void main(String[] args) throws IOException {
		new KonwerterPlikow(new Plik("srp.csv"), new Plik("srp.tsv"), new CsvDoTsv()).wykonaj();
	}
	
}

class KonwerterPlikow {

	private Plik plikWejsciowy;
	private Plik plikWyjsciowy;
	private KonwerterFormatow konwerter;
	
	public KonwerterPlikow(Plik plikWejsciowy, Plik plikWyjsciowy, KonwerterFormatow konwerter) {
		super();
		this.plikWejsciowy = plikWejsciowy;
		this.plikWyjsciowy = plikWyjsciowy;
		this.konwerter = konwerter;
	}

	public void wykonaj() throws IOException {
		plikWyjsciowy.zapisz(konwerter.konwertuj(plikWejsciowy.odczytaj()));
	}
	
}

class Plik {
	private String nazwa;
	
	public Plik(String nazwa) {
		super();
		this.nazwa = nazwa;
	}

	public String odczytaj() throws IOException {
		StringBuilder bufor = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(nazwa))) {
			while(scanner.hasNextLine()) {
				bufor.append(scanner.nextLine()).append("\n");
			}
		}
		return bufor.toString();
	}
	
	public void zapisz(String zawartosc) throws IOException {
		try (FileWriter plikTsv = new FileWriter(nazwa)) {
			plikTsv.write(zawartosc);
		}
	}
}

interface KonwerterFormatow {
	String konwertuj(String zawartosc);
}

class CsvDoTsv implements KonwerterFormatow {
	public String konwertuj(String csv) {
		return csv.toString().replaceAll(",", "	");
	}
}
package pl.andrzejszywala.oop.srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SRP {

	public static void main(String[] args) throws IOException {
		new CsvDoTsv().konwertuj("srp.csv");
	}
	
}

class CsvDoTsv {
	
	public void konwertuj(String plik) throws IOException {
		StringBuilder bufor = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(plik))) {
			while(scanner.hasNextLine()) {
				bufor.append(scanner.nextLine()).append("\n");
			}
		}
		
		String wynik = bufor.toString().replaceAll(",", "	");
		
		try (FileWriter plikTsv = new FileWriter(plik.replace("csv", "tsv"))) {
			plikTsv.write(wynik);
		}
		
	}
}
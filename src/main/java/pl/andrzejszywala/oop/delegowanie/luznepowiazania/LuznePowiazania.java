package pl.andrzejszywala.oop.delegowanie.luznepowiazania;

public class LuznePowiazania {

	class KalkulatorVat {
		float podatek;
		float cena;
				
		float oblicz() {
			StawkiVat stawkiVat = new StawkiVat();
			//...
			podatek = cena * stawkiVat.stawka; // wysoki spotpień powiązania
			//...
			return podatek;
		}
	}
	
	class StawkiVat {
		public float stawka; // powinno być prywatne
		public float wyznaczonaStawka; // powinno być prywatne
		
		public float dajStawke(String produkt) {
			// wyznaczenie stawki podatku;
			
			return wyznaczonaStawka;
		}
	}
}

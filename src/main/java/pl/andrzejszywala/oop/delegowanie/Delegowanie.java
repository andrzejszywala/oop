package pl.andrzejszywala.oop.delegowanie;

public class Delegowanie {

	public static void main(String[] args) {
		UslugaLogowania uslugaLogowania = new UslugaLogowania(new UwierzytelniaczDB());
		uslugaLogowania.loguj("test", "test");
	}
	
}

class UslugaLogowania {
	
	private Uwierzytelniacz uwierzytelniacz;
	
	public UslugaLogowania(Uwierzytelniacz uwierzytelniacz) {
		this.uwierzytelniacz = uwierzytelniacz;
	}
	
	public boolean loguj(String uzytkownik, String haslo) {
		boolean uwierzytelniony = uwierzytelniacz.uwierzytelnij(uzytkownik, haslo);
		
		if (!uwierzytelniony) {
			zwiekszLicznikNiepoprwanychLogowan();
		}
		
		return uwierzytelniony;
	}
	
	private void zwiekszLicznikNiepoprwanychLogowan() {
		// TODO Auto-generated method stub
		
	}
}

interface Uwierzytelniacz {
	boolean uwierzytelnij(String uzytkownik, String haslo);
}

class UwierzytelniaczDB implements Uwierzytelniacz {
	
	@Override
	public boolean uwierzytelnij(String uzytkownik, String haslo) {
		// pobiranie hasła zbazy danych 
		return false;
	}
	
}

class UwierzytelniaczLDAP implements Uwierzytelniacz {
	
	@Override
	public boolean uwierzytelnij(String uzytkownik, String haslo) {
		// pobiranie hasła z LDAP
		return false;
	}
	
}

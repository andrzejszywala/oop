package pl.andrzejszywala.oop.interfejs;

public class Interfejs {

	public static void main(String[] args) {
		Ogrzewany ogrzewany = new Samochod();
		ogrzewany.grzej();
		
		ogrzewany = new Dom();
		ogrzewany.grzej();
	}

}

interface Ogrzewany {
	void grzej();
}

class Samochod implements Ogrzewany {

	@Override
	public void grzej() {
		System.out.println("grzanie samochodu");
	}
}

class Dom implements Ogrzewany {
	
	@Override
	public void grzej() {
		System.out.println("ogrzewanie domu");
	}
}

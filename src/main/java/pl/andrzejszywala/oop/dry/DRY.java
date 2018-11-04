package pl.andrzejszywala.oop.dry;

import java.util.Timer;
import java.util.TimerTask;

public class DRY {

	public static void main(String[] args) {
		Brama brama = new Brama();
		Pilot pilot = new Pilot(brama);
		Kamera kamera = new Kamera(brama);
		
		pilot.nacisnietoPrzycisk();
		kamera.rozpoznanoUprawnionaOsobe();
	}
}

class Brama {
	public void otworz() {
		System.out.println("Brama się otwiera");
	}
	
	public void zamknij() {
		System.out.println("Brama się zamyka");
	}
}

class Pilot {
	
	private Brama brama;
	
	public Pilot(Brama brama) {
		super();
		this.brama = brama;
	}

	public void nacisnietoPrzycisk() {
		brama.otworz();
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				brama.zamknij();
			}
		}, 1000);
	}
}

class Kamera {
	
	private Brama brama;
	
	public Kamera(Brama brama) {
		super();
		this.brama = brama;
	}

	public void rozpoznanoUprawnionaOsobe() {
		brama.otworz();
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				brama.zamknij();
			}
		}, 1000);
	}
}

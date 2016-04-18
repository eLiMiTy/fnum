package ARBEIT;
//FABIAN TEISE
import java.io.IOException;

import oop.IO;

public class Tresor {

	private Gegenstand[] gegenstaende;
	
	public Tresor(Gegenstand[] gegenstaende) {
		this.gegenstaende = gegenstaende;
	}
	
	public Gegenstand[] addGegenstand() throws IOException {
		System.out.println("bitte geben sie ein wie viel platz im treso ist!");
		int zahl = IO.readInteger();
		Gegenstand[] tresor = new Gegenstand [zahl];
		return this.gegenstaende;
	}
}

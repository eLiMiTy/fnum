package Arrays;

import java.io.IOException;

import oop.IO;

public class Lagerbestand {

	public static void main(String[] args) throws IOException {
		
		String[] artikel = IO.readStringArray();
		double[] preis  = IO.readDoubleArray(artikel.length);
		double[] anzahl = IO.readDoubleArray(artikel.length);
		
		double gesamtpreis = 0;
		for (int i = 0; i < artikel.length; i++) {
			gesamtpreis = gesamtpreis + preis[i] * anzahl[i];
		}
		System.out.print("Die gesamtmenge meträgt: " + gesamtpreis);
	}
}
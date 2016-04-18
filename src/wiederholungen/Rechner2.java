package wiederholungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rechner2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {
			
			String antwort;
			
			// Abfrage der 1. Zahl
			do {
				String text;
				System.out.println("Bitte geben sie eine Zahl ein!");
				text = br.readLine();
				int zahl1 = Integer.parseInt(text.trim());
				String text1;
				System.out.println("Bitte geben sie eine zweite Zahl ein!");
				text1 = br.readLine();
				double zahl2 = Double.parseDouble(text1.trim().replace(',', '.'));
				System.out.println(zahl1 + " + " + zahl2 + " = "
						+ (zahl1 + zahl2));
				System.out.println(zahl1 + " - " + zahl2 + " = "
						+ (zahl1 - zahl2));
				System.out.println(zahl1 + " * " + zahl2 + " = "
						+ (zahl1 * zahl2));
				System.out.println(zahl1 + " / " + zahl2 + " = "
						+ (zahl1 / zahl2));
			
			
			System.out.println("Möchten sie noch einmal eine Berechnung durchführen? Antwort: j oder n");
			antwort=br. readLine();
			
			} while (antwort.equalsIgnoreCase( "j"));
			
		}
	}
}
package wiederholungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreieck2 {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {

			String antwort;

			
			do {
				// Funktioniert es?
				
				// Abfrage der Seite a
				String text;
				System.out.println("Bitte geben sie eine Seite a ein!");
				text = br.readLine();
				// Abfrage der Seite b
				String text2;
				System.out.println("Bitte geben sie eine Seite b ein!");
				text2 = br.readLine();
				// Abfrage der Seite c
				String text3;
				System.out.println("Bitte geben sie eine Seite c ein!");
				text3 = br.readLine();
				// Deklaration der Variablen
				double a = Double.parseDouble(text);
				double b = Double.parseDouble(text2);
				double c = Double.parseDouble(text3);
				if ((a < b + c) && (b < a + c) && (c < a + b)) {
					System.out.println("Es funktioniert!");
					// Umfang berechnen 
					double umfang = a + b + c;

					// Ausgabe Ergebnis Umfang
					System.out.println("Umfang = " + umfang);

					// Flächeninhalt berechnen A= 1/2* c*h
					double s = (a + b + c) / 2;
					double A = s * (s - a) * (s - b) * (s - c);

					// Wurzel berechnen
					Math.sqrt(A);

					// Ausgabe des Flächeninhalts
					System.out.println("Flächeninhalt= " + Math.sqrt(A));
				}

				// Wenn es nicht funktioniert
				else {
					System.out.println("Es funktioniert nicht!");
				}
				
				System.out.println("Möchten sie noch einmal eine Berechnung durchführen? Antwort: j oder n");
				antwort=br. readLine();
				
				} while (antwort.equalsIgnoreCase("j"));
		}
	}
}


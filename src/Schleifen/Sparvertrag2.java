 package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sparvertrag2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {
			
			String antwort;

			do {
				
				// Anfangskapital eingeben
				System.out.println("Bitte Kapital eingeben");
				double Kapital = Double.parseDouble(br.readLine().replace(',', '.'));
				
				// Zinssatz eingeben
				System.out.println("Bitte den Zinssatz eingeben");
				double Zinssatz = Double.parseDouble(br.readLine().replace(',', '.'));
				
				// Laufzeit eingeben
				System.out.println("Bitte die Laufzeit eingeben");
				double Laufzeit = Double.parseDouble(br.readLine().replace(',', '.'));
				
				// 1. Zeile eingeben
				System.out.println("Jahr:\t" + "Anfangkapital:\t" + "Zinsbetrag:\t" + "Jahresendbetrag:\t");

				// for- Schleife: erhöhe i (Anzahl der Jahre) solange bis die eingegene Laufzeit erreicht wurde
					for (int i = 1; i <= Laufzeit; i++) {
					
					// Ausgabe der Jahre (Laufzeit)
					System.out.print(i);
					
					// Ausgabe des gerundeten Endbetrages = eingegebenes Kapital
					double endbetrag = Kapital;
					System.out.print("\t" + "\t" + Runden.Runden.runden(endbetrag));

					// Berechnung des Zinsbetrages: der vorherige Endbetrag mal dem eingegebenem Zinssatz durch 100
					double zinsbetrag = (endbetrag * Zinssatz) / 100;
					
					// Ausgabe des gerundeten zinsbetrages
					System.out.print("\t" + "\t" + Runden.Runden.runden(zinsbetrag));

					// Ausrechnung des endbetrages: letzter endbetrag + zinsbetrag
					endbetrag = endbetrag + zinsbetrag;
					
					// Ausgabe des gerundeten endbetrages
					System.out.println("\t" + "\t" + Runden.Runden.runden(endbetrag));

				}
					// Neue Berechnung 
				System.out.println("Wollen sie einen neuen Sparvertrag berechnen? Antwortmöglichkeit = Ja oder beliebige Taste");
				antwort = br.readLine();
				
			} while (antwort.equalsIgnoreCase("Ja"));

		}
	}
}



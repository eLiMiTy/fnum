package Klausur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShaniaAllhusen2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {

			// Abfrage der Variablen nw
			String text;
			System.out.println("Bitte geben Sie den Nettoauftragswert ein!");
			text=br. readLine();

			// Deklarieren der Variablen
			double nw = Double.parseDouble(text.trim().replace(',' , '.'));
			double endnw = Double.parseDouble(text.trim().replace(',' , '.')) ;
			double brutto;

			// Bruttobetrag ausrechnen
			brutto = nw * 1.19;

			// if-Anweisungen
			if (nw < 100.00){
				endnw = brutto + 8.50;
			}
			else if ((nw >= 100.00) && (nw < 200.00)){
				endnw = brutto + 5;
			}
			else if ((nw >= 200.00 )){
				endnw = brutto;
			}
			// Ausgabe
			System.out.println("Ihr Nettobetrag beträgt:" + nw);
			System.out.println("Ihr Bruttobetrag beträgt:" + brutto);
			System.out.println("Ihr Rechnungsbetrag inkl. Porto und Verpackungskosten beträgt:" + endnw );

		}
	}
}



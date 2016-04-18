package Verzweigung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dreiecksungleichung {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Abfrage der Seite a
		String text;
		System.out.println("Bitte geben sie eine Seite a ein!");
		text=br. readLine();

		// Abfrage der Seite b
		String text2;
		System.out.println("Bitte geben sie eine Seite b ein!");
		text2=br. readLine();

		// Abfrage der Seite c
		String text3;
		System.out.println("Bitte geben sie eine Seite c ein!");
		text3=br. readLine();

		// Deklaration der Variablen
		double a = Double.parseDouble(text);
		double b = Double.parseDouble(text2);
		double c = Double.parseDouble(text3);

		// Rechnung
		if ((a < b + c) && (b < a + c) && (c < a + b))

			// Ausgabe
			
			System.out.println("Es funktioniert!");
			
		else System.out.println("Es funktioniert nicht!");

	}

}

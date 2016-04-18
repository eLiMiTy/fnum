package Klausur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShaniaAllhusen {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {

			// Abfrage der Variablen r
			String text;
			System.out.println("Bitte geben sie ihren Rente ein!");
			text=br. readLine();

			// Abfrage der Variablen n
			String text1;
			System.out.println("Bitte geben sie die Laufzeit in Jahren ein!");
			text1=br. readLine();

			// Abfrage der Variablen p
			String text2;
			System.out.println("Bitte geben sie den Zinssatz in Prozent ein!");
			text2=br. readLine();

			// Deklaration der Variablen
			double qn;
			double r = Double.parseDouble(text.trim().replace(',' , '.'));
			double n = Double.parseDouble(text1.trim().replace(',' , '.'));
			double p = Double.parseDouble(text2.trim().replace(',' , '.'));
			double q = Double.parseDouble(text.trim().replace(',' , '.'));
			double a ;
			double Rn;

			// Rechnungen
			a = p/100; 
			q = (1+a);
			qn = Math.pow(q, n);
			Rn = r*((qn-1)/(q-1));

			// Ausgabe
			System.out.println("Ihr Endwert beträgt: " +Rn);
		}
	}
}
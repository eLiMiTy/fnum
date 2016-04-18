package ErsteAufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Abfrage des Namens
		String text;
		System.out.println("Bitte geben sie ihren Vor- und Nachnamen ein!");
		text=br. readLine();

		// Abfrage des Geschlechtes
		String text2;
		System.out.println("Welches Geschlecht haben sie? (m für männlich, w für weiblich)");
		text2=br. readLine();

		String m = new String("m");
		String w = new String("w");


		if (text2.equals("w")) {
			System.out.println("Hallo Frau " + text);
		}

		else if (text2.equals("m")) {
			System.out.println("Hallo Herr " + text);
		}

		else { 
			System.out.println("Hallo " + text);
		}
	}
}

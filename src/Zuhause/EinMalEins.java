package Zuhause;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EinMalEins {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String antwort;

		do {

			int t;

			System.out.println("Welche Zahlenreihe wollen sie anzeigen lassen?");
			int zahl = Integer.parseInt(br.readLine());

			for (int i = 1; i <= 10; i++) {

				t = zahl * i;

				System.out.println("\t" + t);
			}

			System.out.println("Wollen sie eine neue Zahlenreihe anzeigen lassen? Antwortmöglichkeit = j, anderen falls beliebige Taste drücken!");
			antwort = br.readLine();

		} while (antwort.equalsIgnoreCase("j"));

		System.out.println("Das Programm wurde beendet!");

	}
}





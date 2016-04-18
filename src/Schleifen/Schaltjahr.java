package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Schaltjahr {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String antwort;
		int rest = 0;
		int rest2;

		do {
			String text;
			System.out.print("Bei welchem Jahr soll ihre Berechnung starten? ");
			text = br.readLine();
			int anfang = Integer.parseInt(text.trim());

			System.out.print("Bei welchem Jahr soll ihre Berechnung enden? ");
			text = br.readLine();
			int ende = Integer.parseInt(text.trim());

			for (int i = anfang; i <= ende; i++) {
				rest = i % 4;
				if (rest ==0){
					rest = i % 100;
					rest2 = i % 400;
					if (rest>0 || (rest==0 && rest2 ==0)){
						System.out.println(i);
					}
				}
			}
			System.out.println("\nWeitere Aufgabe bearbeiten? Ja/ Nein");
			antwort = br.readLine();

		} while((antwort.equalsIgnoreCase("Ja")));

		System.out.println("Das Programm wird beendet!");
	}
}
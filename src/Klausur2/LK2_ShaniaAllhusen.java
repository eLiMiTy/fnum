package Klausur2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Runden.Runden;

public class LK2_ShaniaAllhusen {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String antwort;

		do {
			double mengeAmJahresende;

			System.out.print("Bitte Menge im mg eingeben:");
			double mengeAmJahresanfang1 = Double.parseDouble(br.readLine().replace(',', '.'));

			System.out.print("Bitte Zerfallsrate pro Jahr in Prozent eingeben:");
			double zerfall1 = Double.parseDouble(br.readLine().replace(',','.'));

			System.out.print("Bitte Zeitspanne in Jahren eingeben: ");
			double zeitspanne = Double.parseDouble(br.readLine().replace(',', '.'));

			System.out.println("\nJahr\t" + "Menge am Jahresanfang\t" + "Zerfall\t" + "\tMenge am Jahresende\t");
			System.out.println("----\t" + "---------------------\t" + "-------\t" + "\t-------------------\t");

			double mengeAmJahresanfang = mengeAmJahresanfang1;

			for (int i = 1; i <= zeitspanne; i++) {

				System.out.print(i);

				System.out.print( "\t"+ Runden.runden(mengeAmJahresanfang, 1));

				double zerfall = (zerfall1 / 100);

				zerfall = mengeAmJahresanfang * zerfall;

				mengeAmJahresende = mengeAmJahresanfang - zerfall;

				System.out.print("\t" + "\t"+ "\t" + Runden.runden(zerfall, 1));

				if (mengeAmJahresende < (mengeAmJahresanfang1 / 2)){
					System.out.println("\t" + "\t"+ Runden.runden(mengeAmJahresende, 1) + " **");
				}
				else{
					System.out.println("\t" + "\t"+ Runden.runden(mengeAmJahresende, 1));
				}

				mengeAmJahresanfang = mengeAmJahresende;
			}
			System.out.println("\nWeitere Aufgabe bearbeiten? 1 = Ja/ 0 = Nein:");
			antwort = br.readLine();

		} while (antwort.equalsIgnoreCase("1"));

		System.out.println("Das Programm wurde beendet!");
	}
}



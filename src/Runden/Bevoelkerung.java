package Runden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bevoelkerung {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String antwort;

		do {
			double anzahlAmJahresende;

			System.out.println("Bitte Anzahl der Menschen in Milliarden erfassen: ");
			double anzahlAmJahresanfang = Double.parseDouble(br.readLine().replace(',', '.'));

			System.out.println("Bitte prozentualen Zuwachs pro Jahr eingeben: ");
			double zuwachs = Double.parseDouble(br.readLine().replace(',','.'));

			System.out.println("Bitte Zeitspanne in Jahren eingeben: ");
			double zeitspanne = Double.parseDouble(br.readLine().replace(',', '.'));

			System.out.println("Auf wieviele Stellen genau soll das Ergebnis angezeigt werden: ");
			int kommastellen = Integer.parseInt(br.readLine());

			for (int i = 1; i <= zeitspanne; i++) {
				System.out.print(i);
				System.out.print("\t"+ "\t"+ Runden.runden(anzahlAmJahresanfang, kommastellen));

				double zuwachsProJahr = (anzahlAmJahresanfang * zuwachs) / 100;
				System.out.print("\t" + "\t"+ Runden.runden(zuwachsProJahr, kommastellen));

				anzahlAmJahresende = anzahlAmJahresanfang + zuwachsProJahr;
				System.out.println("\t" + "\t"+ Runden.runden(anzahlAmJahresende, kommastellen));

				anzahlAmJahresanfang = anzahlAmJahresende;
			}
			System.out.println("Wollen sie einen neuen Bevoelkerungszuwachs berechnen? Antwortmöglichkeit = Ja, anderen falls beliebige Taste drücken!");
			antwort = br.readLine();

		} while (antwort.equalsIgnoreCase("Ja"));
	}
}

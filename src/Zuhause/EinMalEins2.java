package Zuhause;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EinMalEins2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		// Schreiben Sie eine Java-main-Methode, in der das grosse Ein-Mal-Eins berechnet 
		// und tabellarisch auf dem Bildschirm ausgegeben wird. Um die auszugebenen Zahlwerte geeignet einzurücken, 
		// sollten Sie bei der Ausgabe den Tabulator "\n" verwenden. Verwenden Sie die for-Schleife. 

		
		// Fragen: Die jeweilige 1. Zahl der Reihe anzeigen lassen ( bei g) z.B. 11 eine Zeile darunter 121...
		// wann \n und wann \t, wieso leere Ausgabe?

		String antwort;

		do {

			String groesse;

			System.out.println("Wollen sie das kleine (k) oder große (g) Ein-Mal-Eins anzeigen lassen?");
			groesse = br.readLine();

			if (groesse.equalsIgnoreCase("k")){

				for (int i = 1; i <= 10; i++ ) {

					for (int j = 1; j <= 10; j++ ) {

						System.out.print("\t"+  i * j);

					}
					System.out.println();
				}
			}

			else if (groesse.equalsIgnoreCase("g")){
				
				for (int i = 11; i > 10 && i <= 20; i++ ) {
					
					for (int j = 11; j > 10 && j <= 20; j++ ) {
						
					System.out.print("\t" + i * j);
					}
					System.out.println();
				}
			}
			System.out.println("\nWollen sie sich eine Ein-Mal-Eins Reihen anzeigen lassen? Antwortmöglichkeit = j, anderen falls beliebige Taste drücken!");
			antwort = br.readLine();

		} while (antwort.equalsIgnoreCase("j"));

		System.out.println("Das Programm wurde beendet!");
	}
}

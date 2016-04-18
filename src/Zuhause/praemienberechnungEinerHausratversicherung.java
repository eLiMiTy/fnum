package Zuhause;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Runden.Runden;

public class praemienberechnungEinerHausratversicherung {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		{
			String antwort;

			do {
				//Aufgabe
				//Wir betrachten eine fiktive Hausratversicherung, bei der die Pr�mie wie folgt 
				//von der Anzahl Personen personen und Quadratmeteranzahl flaeche der Wohnung abh�ngt:
				
				// personen Pr�mie 
				// 1-2 		10 + flaeche / 2 
				// 3 		15 + flaeche 
				// 4 		15 + 1,5 * flaeche 
				// >4 		25 + 2 * flaeche 
				
				System.out.println("Wie viele Personen leben in dem Haus?");
				int personen = Integer.parseInt(br.readLine());

				System.out.println("Bitte geben sie die Wohnfl�che des Hauses an: ");
				double flaeche = Double.parseDouble(br.readLine().replace(',', '.'));
					
					double praemie;
					
					if (personen == 1 || personen == 2){
						
						praemie = 10 + (flaeche / 2);
						System.out.println("Ihre Pr�mie betr�gt: " + praemie);
					}
				
					else if (personen == 3) {
						
						praemie = 15 + flaeche;
						System.out.println("Ihre Pr�mie betr�gt: " + praemie);
					}
					
						else if (personen == 4) {
						
						praemie = 15 + (1.5 * flaeche);
						System.out.println("Ihre Pr�mie betr�gt: " + praemie);
					}
					
						else if (personen >4){
							
							praemie = 25 + (2 * flaeche);
							
							System.out.println("Ihre Pr�mie betr�gt: " + praemie);
						}
					
				System.out.println("Wollen sie einen neuen Pr�mienberechnung durchf�hren? Antwortm�glichkeit = Ja, anderen falls beliebige Taste dr�cken!");
				antwort = br.readLine();

			} while (antwort.equalsIgnoreCase("Ja"));
		}
	}
}


package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quatette {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		// Anfangskapital eingeben
		System.out.println("Bitte Kapital eingeben");
		double Kapital = Double.parseDouble(br.readLine().replace(',', '.'));

		// Laufzeit eingeben
		System.out.println("Bitte die Laufzeit eingeben");
		int Laufzeit = Integer.parseInt(br.readLine().replace(',', '.'));
		
		// Zinssatz eingeben
		System.out.println("Bitte den Zinssatz eingeben");
		double Zinssatz = Double.parseDouble(br.readLine().replace(',', '.'));
		
		System.out.println("Anfangskapital: \t Laufzeit: \t Zinssatz: ");
		
		for (int i = 1; i <= Laufzeit; i++){
			
			System.out.println(i);
			
			double endkapital;
			endkapital = Kapital;
			System.out.println("\t" + endkapital);
			
			 double zinsbetrag;
			 zinsbetrag = (endkapital * Zinssatz) / 100;
			 System.out.println("\t" + zinsbetrag);
			 
			 
			
			
		}
	}

}
	

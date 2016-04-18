package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sparvertrag {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  {
			
			String antwort;
			
			do {
				// Abfrage Startkapital
				String text;
				System.out.println("Bitte geben sie ihr Startkapital ein!");
				text = br.readLine();
				
				// Abfrage der Variablen n
				String text1;
				System.out.println("Bitte geben sie die Laufzeit in Jahren ein!");
				text1 = br.readLine();
				
				// Abfrage der Variablen p
				String text2;
				System.out.println("Bitte geben sie den Zinssatz in Prozent ein!");
				text2 = br.readLine();
				
				// Deklaration der Variablen
				double s = Double.parseDouble(text.trim().replace(',', '.'));
				double n = Double.parseDouble(text1.trim().replace(',', '.'));
				double p = Double.parseDouble(text2.trim().replace(',', '.'));
				double q = Double.parseDouble(text.trim().replace(',', '.'));
				double q2;
				double Rn;
				double qn;
				double r = Double.parseDouble(text.trim().replace(',', '.'));
				
				
				q = p/ 100;
				qn = Math.pow(q, n);
				Rn = r * ((qn - 1) / (q - 1));	
				Rn = Math.round(Rn);
				Rn = Rn / 100;
				
				for (int i= 1; i < n; i++){
				
					double zinsbetrag;
					double Rn2;
					
					s = s*q;
					zinsbetrag = s * q /100;
					Rn2 = Rn*q;
					Rn = Rn *100;
					Rn = Math.round(Rn);
					Rn = Rn / 100;
					
					System.out.println("Laufzeit:\t" + i  + "\t"
							+ "Ihr Anfangskapital beträgt:\t " + s +  "\t"
							+ "Ihr Zinsbetrag beträgt:\t " + zinsbetrag +  "\t"
							+ "Ihr Jahresendbetrag beträgt:\t " + Rn2 );
					
					
				}
				System.out.println("Möchten sie noch einmal eine Berechnung durchführen? Antwort: j oder n");
				antwort=br. readLine();
				
			
			} while (antwort.equalsIgnoreCase("j"));
			 
			}
		}
	}			

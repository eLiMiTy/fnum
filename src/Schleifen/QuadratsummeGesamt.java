package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadratsummeGesamt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); { 

			// Zahl Eingabe
			String text;
			System.out.println("Bitte geben Sie die Zahl bis wohin die Quadratsumme berechnet werden soll ein!");
			text=br.readLine();

			// Schleifen Auswahl
			System.out.println("Bitte geben Sie ein wie die Fakultät berechnet werden soll! Möglichkeiten: Mit der While Schleife (w) oder mit der For Schleife(f)");
			String schleife = br.readLine();

			// Bestimmen der Variablen f und w
			String f = new String("f");
			String w = new String("w");


			// Bestimmen der Variablen
			int n = Integer.parseInt(text.trim());    
			double qsumme = 0;

			// For- Schleife
			if(schleife.equalsIgnoreCase("f")){ 
				for (int i = 1; i <= n; i = i + 1) {
					qsumme = qsumme + Math.pow(i, 2);
				}
			// Ausgabe
				System.out.println(qsumme);
			}
				// While- Schleife
					else if (schleife.equalsIgnoreCase("w")){
						int i =1;

							while ( i <= n){
								qsumme= qsumme + Math.pow(i, 2);
					i++;
				}

				// Ausgabe
				System.out.println(qsumme);


			}
		}
	}
}


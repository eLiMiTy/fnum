package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Berechnungen {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {

			String auswahl;

			int exit = 0;


			while (exit <= 1) {
				System.out.println("Bitte geben Sie ein ob sie die Quadratsumme, die Fakultät berechnen lassen wollen oder ob sie das Programm beenden wollen!Eingabe: q1, f1 oder x");
				auswahl = br.readLine();
				
				if (auswahl.equalsIgnoreCase("q1")) {
					// Zahl Eingabe n1
					String eingabeq;
					System.out.println("Bitte geben Sie die Zahl bis wohin die Quadratsumme berechnet werden soll ein!");
					eingabeq = br.readLine();

					// Schleifen Auswahl
					System.out.println("Bitte geben Sie ein wie die Fakultät berechnet werden soll! Möglichkeiten: Mit der While Schleife (w2) oder mit der For Schleife(f2)");
					String schleife = br.readLine();

					// Bestimmen der Variablen
					int n1 = Integer.parseInt(eingabeq.trim());
					double qsumme = 0;

					// For- Schleife
					if (schleife.equalsIgnoreCase("f2")) {
						for (int i = 1; i <= n1; i = i + 1) {
							qsumme = qsumme + Math.pow(i, 2);
						}
						// Ausgabe
						System.out.println(qsumme);
					}
					// While- Schleife
					else if (schleife.equalsIgnoreCase("w2")) {
						int i = 1;

						while (i <= n1) {
							qsumme = qsumme + Math.pow(i, 2);
							i++;
						}

						// Ausgabe
						System.out.println(qsumme);

					}
				}

				else if (auswahl.equalsIgnoreCase("f1")) {

					// Zahl eingabe bis wohin die Fakultät 
					String text1;
					System.out
					.println("Bitte geben Sie die Zahl bis wohin die Fakultät berechnet werden soll ein!");
					text1 = br.readLine();

					// Schleifen Auswahl
					System.out
					.println("Bitte geben Sie ein wie die Fakultät berechnet werden soll! Möglichkeiten: Mit der While Schleife (w) oder mit der For Schleife(f)");
					String schleife = br.readLine();

					// Bestimmen der Variablen f und w
					String f = new String("f");

					// Bestimmen der Variablen
					int fa = Integer.parseInt(text1.trim());
					int fa2 = 1;

					// While-Schleife
					if (schleife.equalsIgnoreCase("w")) {

						int i = 1;

						while (i <= fa) {

							fa2 = fa2 * i;
							i++;
						}

						// Ausgabe
						System.out.println(fa2);
					}

					// For- Schleife
					else if (schleife.equalsIgnoreCase(f)) {

						for (int i = 1; i <= fa; i++) {

							fa2 = fa2 * i;

						}

						// Ausgabe
						System.out.println(fa2);
					}
					
				}
				// Programm beenden
				else if (auswahl.equalsIgnoreCase("x")) {
					exit = 2;
					System.out.println("Das Programm wird beendet!");
				}

				// Falsche Eingabe
				else {
					System.out.println("Sie haben eine falsche Eingabe getätigt!");
				}
			}
		}
	}
}




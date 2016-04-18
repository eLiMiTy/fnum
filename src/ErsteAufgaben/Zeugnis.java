package ErsteAufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {

	private static final int Zensur = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Abfrage der 1. Zensur
		String text;
		System.out.println("Zensur 1=");
		text=br. readLine();
		
		// Deklaration zensur1
		int zensur1= Integer.parseInt(text.trim());
		
		// Abfrage der 2. Zensur
		String text1;
		System.out.println("Zensur 2=");
		text1 =br. readLine();
		
		// Deklaration zensur2
		int zensur2= Integer.parseInt(text.trim());
		
		// Abfrage der 3. Zensur
		String text2;
		System.out.println("Zensur 3=");
		text2=br. readLine();
		
		// Deklaration zensur3
		int zensur3= Integer.parseInt(text.trim());
		
		// Rechnung des Durchschnitts
		double durchschnitt= ((zensur1+zensur2+zensur3)/3);
		
		// Ausgabe des Ergebnisses
		System.out.println("Durchschnitt=" + durchschnitt);
		

		
	}

}

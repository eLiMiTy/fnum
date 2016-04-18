package ErsteAufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Abfrage des Namen's
		String text;
		System.out.println("Bitte geben sie ihren Vor- und Nachnamen ein!");
		text=br. readLine();

		// Abfrage des Geschlechtes
		String text2;
		System.out.println("Welches Geschlecht haben sie? (1 für männlich, 2 für weiblich)");
		text2=br. readLine();
		
		// Deklaration der Variablen m und w
		String m = new String("1");
		String w = new String("2");

		// Ausgabe 
		if (text2.equals(w)) 
				{System.out.println("Hallo Frau " + text);
				}
		
		else if (text2.equals(m)) 
			{System.out.println("Hallo Herr " + text);
			}
		
		else 
		{ System.out.println("Hallo" + text);
	}
	}
}
	
	

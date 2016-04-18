package EVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LängeEinesDreidimensionalenVektors {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String text;
		System.out.print("Bitte geben sie x1 ein ");
		text = br.readLine();
		
		String text1;
		System.out.print("Bitte geben sie x2 ein ");
		text1 = br.readLine();
		
		String text3;
		System.out.print("Bitte geben sie x3 ein ");
		text3 = br.readLine();
		
		// Deklarieren der Variablen
		int x1 = Integer.parseInt(text.trim());
		int x2 = Integer.parseInt(text1.trim());
		int x3 = Integer.parseInt(text3.trim());
		double m;
		
		
		// Rechnung
		// m= Wurzel aus x1 hoch 2 + x2 hoch 2 + x3 hoch 2
		
		m = Math.sqrt((Math.pow(x1, 2)) + (Math.pow(x2, 2)) + (Math.pow(x3, 2)));
		
		System.out.println(m);
		
	}

}

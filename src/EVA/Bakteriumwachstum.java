package EVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bakteriumwachstum {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text;
		System.out.print("Bitte geben sie die Stundenanzahl ein! ");
		text = br.readLine();


		// Deklarieren der Variablen
		int t = Integer.parseInt(text.trim());
		double m;


		// Rechnung

		m = 110 * (Math.pow(10, -15))*(Math.pow(2, (t*3)));

		System.out.println(m); 
	}
}

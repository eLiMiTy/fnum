package EVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchieferWurf {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text;
		System.out.print("Bitte geben sie die Anfangsgeschwindigkeit in m/s ein! ");
		text = br.readLine();
		
		String text1;
		System.out.print("Bitte geben sie den Abwurfwinkel in Grad ein! ");
		text1 = br.readLine();
		
		String text2;
		System.out.print("Bitte geben sie die Anfangshöhe in Meter ein! ");
		text2 = br.readLine();


		// Deklarieren der Variablen
		double v = Double.parseDouble(text.trim().replace(',' , '.'));
		double a = Double.parseDouble(text1.trim().replace(',' , '.'));
		double h0 = Double.parseDouble(text2.trim().replace(',' , '.'));
		double aRad;
		double x;
		double y;
		double t = 0.10;

		// Rechnung
		aRad = Math.PI / 180*a;
		x = v * Math.cos(aRad) * t;
		y = v * Math.sin(aRad) * t + h0 - 0.5 * 9.81 * (Math.pow(t, 2));
		
		System.out.println("x (Wurfweite): \t" + x + "\t" + "y (Wurfhöhe): \t" + y );

	}
}

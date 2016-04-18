package ErsteAufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rechner {

	private static final String Interger = null;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Abfrage der 1. Zahl
		String text;
		System.out.println("Bitte geben sie eine Zahl ein!");
		text=br. readLine();
		
		// Deklaration Variable zahl1
		int zahl1= Integer.parseInt(text.trim());
		
		// Abfrage der 2. Zahl
		String text1;
		System.out.println("Bitte geben sie eine zweite Zahl ein!");
		text1=br. readLine();
	
		// Deklaration der Variable zahl2
		double zahl2= Double.parseDouble(text1.trim().replace(',', '.'));
	
		// Ausgabe
	
		System.out.println (zahl1 + " + " +zahl2 + " = " + (zahl1 + zahl2));
		System.out.println (zahl1 + " - " +zahl2 + " = " + (zahl1 - zahl2));
		System.out.println (zahl1 + " * " +zahl2 + " = " + (zahl1 * zahl2));
		System.out.println (zahl1 + " / " +zahl2 + " = " + (zahl1 / zahl2));


	}}



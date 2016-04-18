package oop;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static String readString()throws IOException {


		String text;
		text = br.readLine();

		return text;
	}

	public static boolean readBoolean() throws IOException {

		while (true) {
			String tmpEingabe = br.readLine();
			if (tmpEingabe != null) {
				if ((tmpEingabe.equalsIgnoreCase("ja"))
						|| (tmpEingabe.equalsIgnoreCase("j")) 
						|| (tmpEingabe.equalsIgnoreCase("yes"))
						|| (tmpEingabe.equalsIgnoreCase("y")) ) {
					return true;
				}
				else if ((tmpEingabe.equalsIgnoreCase("nein"))
						|| (tmpEingabe.equalsIgnoreCase("n")) 
						|| (tmpEingabe.equalsIgnoreCase("no"))
						|| (tmpEingabe.equalsIgnoreCase("ne")) ){
					return false;

				}

			}

			System.out.print("Ungültige Eingabe! Bitte erneut versuchen: ");
		}
	}

	public static double readDouble() throws IOException {

		while (true) {
			try {
				double number = Double.parseDouble(IO.readString().replace(',', '.'));
				return number;
			}
			catch (NumberFormatException e) {
				System.out.print("Keine Kommazahl! Bitte erneut versuchen: ");

			}
		}
	}

	public static int readInteger() throws IOException {

		while (true) {
			try {
				int number = Integer.parseInt(IO.readString());
				return number;
			}
			catch (NumberFormatException e) {
				System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
			}
		}
	}

	public static double[] readDoubleArray() throws IOException {
		//FABIAN TEISE
		String text = oop.IO.readString();
		int anzahl = Integer.parseInt(text.trim());
		double[] arrfest = new double [anzahl];

		for(int i = 0; i < anzahl; i++) {
			arrfest[i] = oop.IO.readDouble();
		}
		return arrfest;
	}

	public static void writeDoubleArray(double arrfest[]){

		for(int i = 0; i < arrfest.length; i++){

			System.out.println(arrfest[i]);
		}
	}

	public static double[] readDoubleArray(int anzahl) throws IOException {
		double[] arrfest = new double [anzahl];

		for(int i = 0; i < anzahl; i++) {
			System.out.println("Geben Sie die " +(i+1)+ ". Zahl ein: ");
			arrfest[i] = oop.IO.readDouble();
		}
		return arrfest;
	}
	public static int[] readintArray() throws IOException {

		System.out.println("Bitte geben sie an wie viele Zahlen sie erfassen wollen: ");
		String text = oop.IO.readString();
		int anzahl = Integer.parseInt(text.trim());
		int[] arrfest = new int [anzahl];

		for(int i = 0; i < anzahl; i++) {
			System.out.println("Geben Sie die " +(i+1)+ ". Zahl ein: ");
			arrfest[i] = oop.IO.readInteger();
		}
		return arrfest;
	}

	public static void writeintArray(int arrfest[]){

		for(int i = 0; i < arrfest.length; i++){

			System.out.println(arrfest[i]);
		}
	}

	public static int[] readintArray(int anzahl) throws IOException {
		int[] arrfest = new int [anzahl];

		for(int i = 0; i < anzahl; i++) {
			System.out.println("Geben Sie die " +(i+1)+ ". Zahl ein: ");
			arrfest[i] = oop.IO.readInteger();
		}
		return arrfest;
	}
	public static String[] readStringArray() throws IOException {
		System.out.println("Bitte geben sie an wie viele Wörter sie erfassen wollen: ");
		String text = oop.IO.readString();
		int anzahl = Integer.parseInt(text.trim());
		String[] arrfest = new String [anzahl];

		for(int i = 0; i < anzahl; i++) {
			System.out.println("Geben Sie das " +(i+1)+ ". Wort ein: ");
			arrfest[i] = oop.IO.readString();
		}
		return arrfest;
	}

}
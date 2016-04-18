package Zuhause;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import oop.IO;

	public class übungenfürdentest {
		private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		public static void main(String[] args) throws IOException {
			System.out.print("Geben sie ein wie viele Werte sie eingeben möchten:");
			String menge = br.readLine();
			int x = Integer.parseInt(menge.trim());
			double [] r = new double[x];
			for(int i = 0; i<r.length; i++){
				System.out.print("Geben sie eine Zahl ein: ");
				r [i] = IO.readDouble();
			}


			ermittelMin(r);
			ermittelMax(r);
			berechneMittelwert(r);
			berechneVarianz(r);
			berechneStandardAbweichung(r);
			System.out.println("Möchten sie noch eine Berechnung durchführen ?");
			readBoolean();
		}


		public static void writeDoubleArray(double[] Anzahl){

			for(int i = 0; i<Anzahl.length; i++){
				System.out.println("Wert" + (i+1) + ": " + Anzahl[i]);
			}
		}
		public static void ermittelMin(double[] Anzahl) {

			Arrays.sort(Anzahl);
			System.out.println("Der kleinste Wert ist " + Anzahl[0] + ".");
		}
		public static void ermittelMax(double[] Anzahl) {

			Arrays.sort(Anzahl);
			System.out.println("Der größte Wert ist " + Anzahl[Anzahl.length -1] + ".");
		}
		public static void berechneMittelwert(double[] Anzahl){
			double summeAnzahl = 0;
			for (int i = 0; i<Anzahl.length; i ++){
				summeAnzahl = summeAnzahl + Anzahl[i]; 
			}
			double geteiltAnzahl = (summeAnzahl / Anzahl.length);
			System.out.println("Der Mittelwert ist: " + geteiltAnzahl);
		}
		public static void berechneVarianz(double [] Anzahl){
			double summeAnzahl = 0;
			for (int i = 0; i<Anzahl.length; i ++){
				summeAnzahl = summeAnzahl + Anzahl[i]; 
			}
			double geteiltAnzahl = (summeAnzahl / Anzahl.length);
			double [] varianz = new double[Anzahl.length];
			for (int i = 0; i<Anzahl.length; i ++){
				varianz[i] = (Anzahl[i] - geteiltAnzahl);
			}
			double [] quadratVarianz = new double[Anzahl.length];
			for( int i = 0; i<Anzahl.length; i++){
				quadratVarianz[i] = Math.pow(varianz[i],2);

			}
			System.out.println("Die Werte für die Varianz sind : ");
			for(int i = 0; i<Anzahl.length; i++){
				System.out.println("Wert" + (i+1) + ": " + quadratVarianz[i]);
			}
		}
		public static void berechneStandardAbweichung(double [] Anzahl){
			double summeAnzahl = 0;
			for (int i = 0; i<Anzahl.length; i ++){
				summeAnzahl = summeAnzahl + Anzahl[i]; 
			}
			double geteiltAnzahl = (summeAnzahl / Anzahl.length);
			double [] varianz = new double[Anzahl.length];
			for (int i = 0; i<Anzahl.length; i ++){
				varianz[i] = (Anzahl[i] - geteiltAnzahl);
			}
			double [] quadratVarianz = new double[Anzahl.length];
			for( int i = 0; i<Anzahl.length; i++){
				quadratVarianz[i] = Math.pow(varianz[i],2);

			}


			double [] standardAbweichung = new double [Anzahl.length];
			for( int i = 0; i<Anzahl.length; i++){
				standardAbweichung[i] = Math.sqrt(quadratVarianz[i]);

			}
			System.out.println("Die Werte für die Standardabweichung sind:");
			for(int i = 0; i<Anzahl.length; i++){
				System.out.println("Wert" + (i+1) + ": " + standardAbweichung[i]);
			}
		}
		public static boolean readBoolean() throws IOException{

			while (true) {
				String Eingabe = br.readLine();
				if (Eingabe != null) { 

					if (Eingabe.equalsIgnoreCase("ja")
							|| Eingabe.equalsIgnoreCase("j")
							|| Eingabe.equalsIgnoreCase("yes")
							|| Eingabe.equalsIgnoreCase("y"))
					{ 
						return true;
					}
					else if ((Eingabe.equalsIgnoreCase("nein"))
							|| (Eingabe.equalsIgnoreCase("n"))
							|| (Eingabe.equalsIgnoreCase("no")))
					{ 
						return false;
					}				
					else System.out.println("Ungültige Eingabe. Bitte erneut versuchen: ");
				}else System.out.println("Ungültige Eingabe. Bitte erneut versuchen: ");
			}
		}
	
}

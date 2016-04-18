package ARBEIT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LK3_FabianTeise {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {
			
		}
		System.out.println("Wie viele unterschiedliche Produkte haben Sie ?");
	    String inttext = br.readLine();
	    int anzahl = Integer.parseInt(inttext);
		double[] arrX = new double [anzahl];

		for(int i = 0; i < anzahl; i++) {
			System.out.print("Preis des Produkts "+(i + 1)+":");
		String doubletxt = br.readLine().trim().replace(',', '.');;
		arrX[i] = Double.parseDouble(doubletxt); 
				
		}
		System.out.println("Erfassen sie die Verkaufsmenge aller Produkte : ");
		double[] arrY = new double [anzahl];

		for(int j = 0; j < anzahl; j++) {
			System.out.print("Verkufszahlen des Produkts " +(j+1)+ ": ");
			String txt = br.readLine().trim().replace(',', '.');;
			arrY[j] = Double.parseDouble(txt); 
			


		}
		System.out.println("Der Mittlere Preis ist: " + berechneMittelwert(arrX));
		System.out.println("Die mittlere Verkaufsmenge ist: " + berechneMittelwert(arrY));
		System.out.println("Die Preisvarianz ist: " + berechneVarianz(arrX));
		System.out.println("Die Kovarianz ist: " + berechneKovarianz(arrX, arrY));
		System.out.println("Der Regressionskoeffizient A ist: " + berecheneRegA(arrX, arrY));
		System.out.println("Der Regressionskoeffizient B ist: " + berecheneRegB(arrX, arrY));
	}

	//mittelwert Arith

	public static double berechneMittelwert(double[] x) {

		double arith = 0;
		for(int i = 0;i < x.length;i++) {
			arith += x[i];
		}
		arith /= x.length;
		return arith;
	}

	//Varianz

	public static double berechneVarianz(double[] x) {

		double varianz = 0, arith = 0;
		arith = berechneMittelwert(x);
		for(int i = 0;i < x.length;i++) {
			varianz += Math.pow(x[i] - arith, 2);
		}
		varianz /= x.length;
		return varianz;
	}
	//berechnung von 
	//kovarianzberechnen 

	public static double berechneKovarianz(double[] x,double[]y) {
		double kovarianz = 0;
		for (int i = 0; i < y.length; i++) {
			kovarianz += (x[i] - berechneMittelwert(x)) * (y[i] - berechneMittelwert(y));
			
		}
		kovarianz = kovarianz / x.length;
		return kovarianz;
	}	

public static double berecheneRegB(double[] x,double[] y) {
	double b =0; 
	b = berechneKovarianz( x, y) / berechneVarianz(x);
	return b;
}
public static double berecheneRegA(double[] x,double[] y) {
	double a = berechneMittelwert(y) - (berecheneRegB(x, y) * berechneMittelwert(x));
	return a;
} 
}
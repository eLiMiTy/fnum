package Zuhause;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradengleichungBerechnung {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); {
			// Abfrage der Variablen x1
			String text;
			System.out.println("Bitte geben Sie x1 ein!");
			text=br. readLine();

			// Abfrage der Variablen y1
			String text1;
			System.out.println("Bitte geben Sie y1 ein!");
			text1=br. readLine();

			// Abfrage der Variablen x2
			String text2;
			System.out.println("Bitte geben Sie x2 ein!");
			text2=br. readLine();

			// Abfrage der Variablen y2
			String text3;
			System.out.println("Bitte geben Sie y2 ein!");
			text3=br. readLine();

			// Deklarieren der Variablen
			double x1=Double.parseDouble(text.trim().replace(',' , '.'));
			double y1=Double.parseDouble(text1.trim().replace(',' , '.'));
			double x2=Double.parseDouble(text2.trim().replace(',' , '.'));
			double y2=Double.parseDouble(text3.trim().replace(',' , '.'));
			double m;
			double b;

			// Berechnung von m
			m= (y2-(y1))/(x2-(x1));

			//if Anweisungen
			if (m==-m){
				b= y1+m*x1;
			}

			else{
				b= y1-m*x1;
			}

			//Ausgabe
			System.out.println("m= " +m);
			System.out.println("b= " +b);

			if(b < 0){
				System.out.println("f(x)=" +m+ "x"+ b);
			}
			else if (b> 0) {
				System.out.println("f(x)=" +m+ "x+"+ b);
			}
		}
	}
}



package Runden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leibniz {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.println("Wie weit, also mit wie vielen Berechnungen soll der Leibniz-Reihe angenähert werden?");
		int zahl = Integer.parseInt(br.readLine());;
		boolean b = false;
		double zahl2 = 0;
		int x=1;
		
		
		for (int i = 1; i <= zahl; x= x + 2 ) {
			
			if (b == false){
				
				zahl2= zahl2 + (1/x);
				b= true;
				System.out.println(zahl2*4);
				
			}
			
			else if (b==true)
				
				zahl2 = zahl2 - (1/x);
				b = true;
				System.out.println(zahl2*4);
		}
		
		
	}
}
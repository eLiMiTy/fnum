package Fallunterscheidungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Alterspruefung {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Abfrage wie alt sind sie 
		System.out.println("Wie alt sind sie?");
		String text;
		text = br.readLine();
		
		int alter =Integer.parseInt(text.trim());
		
		if (alter < 18) {


			System.out.println("Du bist noch minderjährig!");}
			
			
			else { 
			
			System.out.println("Du bist schon volljährig!");
		}
	}
}



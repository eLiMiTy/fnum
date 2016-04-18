package oop;

import java.io.IOException;

public class TestIO {

	public static void main(String[] args) throws IOException {
		
	boolean test;
			
		do {
		int text = IO.readInteger();  // Die String variable text wird mit dem Rückgabewert initialisiert
		System.out.println(text);
		
		System.out.println("Wollen sie noch eine Zahl eingeben?");
		test = IO.readBoolean(); 
		}while(test);
		
	}
}

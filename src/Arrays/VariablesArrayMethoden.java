package Arrays;

import java.io.IOException;

public class VariablesArrayMethoden {	
	

	public static int[] einlesenZahlen() throws IOException {

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
	public static void ausgebenZahlen(int arrfest[]){

		for(int i = 0; i < arrfest.length; i++){

			System.out.println(arrfest[i]);
		}
	}
}

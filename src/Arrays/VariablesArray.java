package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VariablesArray {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Bitte geben sie an wie viele Zahlen sie erfassen wollen: ");
		String text = br.readLine();
		int anzahl = Integer.parseInt(text.trim());

		int arrfest[] = new int [5];

		for(int i = 0; i < anzahl; i++) {
			System.out.println("Geben Sie die " +(i+1)+ ". Zahl ein: ");
			arrfest[i] = oop.IO.readInteger();
		}

		for(int i = 0; i < anzahl; i++){

			System.out.println(arrfest[i]);
		}
	}
}
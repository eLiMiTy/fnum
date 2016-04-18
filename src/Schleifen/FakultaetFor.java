package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultaetFor {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); { 

			String text;
			System.out.println("Bitte geben Sie die Zahl bis wohin die Fakultät berechnet werden soll ein!");
			text=br.readLine();

			int fa = Integer.parseInt(text.trim());
			int fa2=1;

			for (int i=1; i <= fa; i++){

				fa2= fa2*i;
			}
		System.out.println(fa2);
		}
	}
}


package Fallunterscheidungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Alterpruefung2 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Wie alt sind sie?");
		String text;
		text = br.readLine();

		int alter = Integer.parseInt(text.trim());

		if (alter <= 14) {


			System.out.println("Du darfst noch nicht Mofa fahren.");

		}
			if (alter <16 && alter > 14){

				System.out.println("Du darfst Mofa fahren, aber nicht Moped!");
			}

			if (alter <18 && alter >=16){

				System.out.println("Du darfst Moped fahrend, aber nicht Auto!");

			}
			if (alter >= 18) {


				System.out.println("Du darfst Auto fahren.");
			}
		}
	}







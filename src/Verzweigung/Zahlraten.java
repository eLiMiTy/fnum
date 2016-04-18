package Verzweigung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Zahlraten { 



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Deklaration der Variablen
		String ja = new String("ja");
		String nein = new String("nein");

		// Aufforderung zum ausdenken einer Zahl
		System.out.println("Denken sie sich eine Zahl zwischen 1 und 10 aus!");
		String text;

		// Abfrage
		System.out.println("Ist ihre Zahl zwischen 1 und 5? Antwortmöglichkeiten ja oder nein! ");
		text = br.readLine();

		if (text.equalsIgnoreCase("ja")) {

			System.out.println("Ist ihre Zahl <=3?");
			text = br.readLine(); 

			if (text.equalsIgnoreCase("nein")){

				System.out.println("Ist ihre Zahl 4?");
				text = br. readLine(); 

				if (text.equalsIgnoreCase("nein")){

					System.out.println("Ihre Zahl ist 5!");
					text = br. readLine();} 

				if (text.equalsIgnoreCase("ja")){

					System.out.println("Ihre Zahl ist 4!");
					text = br. readLine();} 
			}


			if (text.equalsIgnoreCase("ja")){

				System.out.println("Ist ihre Zahl <=2?");
				text = br. readLine(); 


				if (text.equalsIgnoreCase("nein")){
					System.out.println("Ihre Zahl ist 3!");
				}
			}



			if (text.equalsIgnoreCase("ja")){


				System.out.println("Ist ihre Zahl 2?");
				text=br. readLine();


				if (text.equalsIgnoreCase("ja")){

					System.out.println("Ihre Zahl ist 2!");


				}

				if (text.equalsIgnoreCase("nein")){

					System.out.println("Ihre Zahl ist 1! ");
					text=br. readLine();

				}
			}
		}

		if (text.equalsIgnoreCase("nein")) {


			System.out.println("Ist ihre Zahl <=8?");
			text=br. readLine(); 

			if (text.equalsIgnoreCase("ja"))
			{

				System.out.println("Ist ihre Zahl <=7?");
				text=br. readLine(); 

				if (text.equalsIgnoreCase("nein")){

					System.out.println("Ihre Zahl ist 8!");
					text = br. readLine(); 
				}
				if (text.equalsIgnoreCase("ja"))
				{

					System.out.println("Ist ihre Zahl 7?");
					text=br. readLine();

					if (text.equalsIgnoreCase(ja)){


						System.out.println("Ihre Zahl ist 7!");
						text=br. readLine();
					}
					if (text.equalsIgnoreCase(nein)){

						System.out.println("Ihre Zahl ist 6!");
						text=br. readLine();
					}
				}
			}
		}
		if (text.equalsIgnoreCase(nein)){

			System.out.println("Ist ihre Zahl 9?");
			text=br. readLine();

			if (text.equalsIgnoreCase(ja)){

				System.out.println("Ihre Zahl ist 9!");


			}

			if (text.equalsIgnoreCase(nein)){


				System.out.println("Ihre Zahl ist 10!");
			}
		}
	}
}

















package Schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FakultaetGesamt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); { 


			String text;
			System.out.println("Bitte geben Sie die Zahl bis wohin die Fakultät berechnet werden soll ein!");
			text=br.readLine();

			int exit = 0;
			while (exit <= 1) {

				System.out.println("Bitte geben Sie ein wie die Fakultät berechnet werden soll! Möglichkeiten: Mit der While Schleife (w) oder mit der For Schleife(f)");
				String schleife = br.readLine();

				String f = new String("f");
				String w = new String("w");


				int fa = Integer.parseInt(text.trim());
				int fa2=1;

				if(schleife.equalsIgnoreCase("w")){

					int i=1;

					while (i <= fa){

						fa2= fa2*i;
						i++;
					}
					System.out.println(fa2);
				}
				else if (schleife.equalsIgnoreCase(f)){

					for (int i=1; i <= fa; i++){

						fa2= fa2*i;

					}
					System.out.println(fa2);
				}
				exit = 2;
			}
		}
	}
}


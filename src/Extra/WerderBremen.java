package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WerderBremen {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text;
		System.out.println("Welche Personengruppe sind sie? 1= Kinder/Jugendliche 2=Erwachsene 3=körperlich/geistig Eingeschränkt");
		text=br. readLine();
		int person= Integer.parseInt(text.trim());

		String text1;
		System.out.println("In welche Liga wollen sie? 1= Bundesliga 2= Europa-League 3= Championsleague");
		text1=br. readLine(); 
		int liga= Integer.parseInt(text1.trim());

		String text2;
		System.out.println("Wie viele Tickets wollen sie kaufen?");
		text2=br. readLine();
		int tickets= Integer.parseInt(text2.trim());

		String text3;
		System.out.println("Wo möchten sie sitzen? OW = Ost-/Westkurve oder NS = Nord-/Südrang");
		text3=br. readLine();
		String platz= (text3.trim());

		String OW = (text3.trim());

		if ((person==2) && (liga==1) && (tickets==1) && (platz.equals("OW"))){
			System.out.println("Bitte bezahlen sie 15€");
		}
	}

}

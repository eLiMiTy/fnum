package Verzweigung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZahlenratenFenja {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Denken Sie sich eine Zahl zwischen 1 und 10 aus!");

		String text;
		System.out.print("Liegt die Zahl zwischen 1 und 5? (Ja=j, Nein=n) ");
		text = br.readLine();

		String ja = new String ("j");
		String nein = new String ("n");

		//Zahl 1,2,3,4 oder 5
		if (text.equals(ja))
		{ 
			String text1;
			System.out.print("Liegt die Zahl zwischen 1 und 3? (Ja=j, Nein=n) ");
			text1 = br.readLine();

			//Zahl 1,2 oder 3
			if (text1.equals(ja))
			{
				String text2;
				System.out.print("Liegt die Zahl zwischen 1 und 2? (Ja=j, Nein=n) ");
				text2 = br.readLine();

				//Zahl 1 oder 2
				if (text2.equals(ja))
				{
					String text3;
					System.out.print("Ist die Zahl 1? (Ja=j, Nein=n) ");
					text3 = br.readLine();

					//Zahl 1
					if (text3.equals(ja))
					{
						System.out.print("Die Zahl ist 1! ");
					}

					//Zahl 2
					if (text3.equals(nein))
					{
						System.out.print("Die Zahl ist 2! ");
					}
				}

				//Zahl 3
				if (text2.equals(nein))
				{
					System.out.print("Die Zahl ist 3! ");
				}
			}

			//Zahl 4 oder 5
			if (text1.equals(nein))
			{
				{
					String text2;
					System.out.print("Ist die Zahl 4? (Ja=j, Nein=n) ");
					text2 = br.readLine();

					//Zahl 4
					if (text2.equals(ja))
					{
						System.out.print("Die Zahl ist 4! ");
					}

					//Zahl 5
					if (text2.equals(nein))
					{
						System.out.print("Die Zahl ist 5! ");
					}
				}
			} 
		}



		//Zahl 6,7,8,9 oder 10
		if (text.equals(nein))
		{ 
			String text1;
			System.out.print("Liegt die Zahl zwischen 6 und 8? (Ja=j, Nein=n) ");
			text1 = br.readLine();

			//Zahl 6,7, oder 8
			if (text1.equals(ja))
			{
				String text2;
				System.out.print("Liegt die Zahl zwischen 6 und 7? (Ja=j, Nein=n) ");
				text2 = br.readLine();

				//Zahl 6 oder 7
				if (text2.equals(ja))
				{
					String text3;
					System.out.print("Ist die Zahl 6? (Ja=j, Nein=n) ");
					text3 = br.readLine();

					//Zahl 6
					if (text3.equals(ja))
					{
						System.out.print("Die Zahl ist 6! ");
					}

					//Zahl 7
					if (text3.equals(nein))
					{
						System.out.print("Die Zahl ist 7! ");
					}
				}
				//Zahl 8
				if (text2.equals(nein))
				{
					System.out.print("Die Zahl ist 8! ");
				}
			}

			//Zahl 9 oder 10
			if (text1.equals(nein))
			{
				{
					String text2;
					System.out.print("Ist die Zahl 9? (Ja=j, Nein=n) ");
					text2 = br.readLine();

					//Zahl 9
					if (text2.equals(ja))
					{
						System.out.print("Die Zahl ist 9! ");
					}

					//Zahl 10
					if (text2.equals(nein))
					{
						System.out.print("Die Zahl ist 10! ");
					}
				}
			} 
		}
	}
}



package Zuhause;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pqformel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("p-q-Formel Rechner");
		{
			String text1;
			System.out.println("Bitte geben sie das p ein!");
			text1=br. readLine();

			String text;
			System.out.println("Bitte geben sie das q ein!");
			text=br. readLine();

			// x^y = -p/2 +- Wurzel aus (p zum Quadrat / 4 -q)
			// x= -p/2 + Wurzel aus p2/4 -q
			double p = Double.parseDouble(text1.trim().replace(',' , '.'));
			double q = Double.parseDouble(text.trim().replace(',' , '.'));
			double x = Double.parseDouble(text.trim().replace(',' , '.'));
			double y = Double.parseDouble(text.trim().replace(',' , '.'));
			double p2 = Double.parseDouble(text.trim().replace(',' , '.'));
			double a = Double.parseDouble(text.trim().replace(',' , '.'));
			double z = Double.parseDouble(text.trim().replace(',' , '.'));

			p2 = p/2;

			// p hoch 2
			a = Math.pow(p, 2);
			// wurzel aus q
			if (a/4-q < 0) {
				System.out.println("Es gibt keine Lösung!");
			}
			else {
				z = Math.sqrt(a/4-q);

				if (z==0 ){ 
					System.out.println(-p/2);
				}
				else {
					x = (-p2 + z);
					y = (-p2 - z);

					System.out.println(x);
					System.out.println(y);
				}
			}
		}
	}
}

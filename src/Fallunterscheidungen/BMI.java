package Fallunterscheidungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BMI {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Welches Geschlecht haben sie? m = m‰nnlich, w = weiblich");
		String text;
		String gender = br.readLine();

		System.out.println("Wie groﬂ sind sie? Eingabe bitte in Metern z.B. 1,66");
		text = br.readLine();
		double groesse = Double.parseDouble(text.trim().replace(',' , '.'));


		System.out.println("Wie viel wiegen sie? Eingabe bitte in Kg z.B. 50");
		text = br.readLine();
		double gewicht = Double.parseDouble(text);

		String m = new String("m");
		String w = new String("w");


		double bmi= gewicht / (groesse*groesse);
		double bmi2 = Math.round(10.0 * bmi )/ 10.0;

		// weiblich
		if (gender.equals("w") && (bmi < 19)){

			System.out.println("Sie sind Untergewichtig!");
			System.out.println("BMI:" + bmi2);
		}

		else if (gender.equals("w") && ((bmi > 19) && (bmi < 24))){

			System.out.println("Sie sind Normalgewichtig!");
			System.out.println("BMI:" + bmi2);
		}

		else if (gender.equals("w") && ((bmi > 24) && (bmi < 30))){

			System.out.println("Sie sind ‹bergewichtig!");
			System.out.println("BMI:" + bmi2);
		}

		else if (gender.equals("w") && ((bmi > 30) && (bmi < 40))){

			System.out.println("Sie haben Adipositas!");
			System.out.println("BMI:" + bmi2);
		}

		else if (gender.equals("w") && ((bmi > 40))){

			System.out.println("Sie haben eine starke Adipositas!");
			System.out.println("BMI:" + bmi2);
		}



		// m‰nnlich
		
		else if (gender.equals("m") && (bmi <= 20)){

			System.out.println("Sie sind Untergewichtig!");
			System.out.println("BMI:" + bmi2);
		}

		else if (gender.equals("m") && ((bmi > 20) && (bmi <= 25))){

			System.out.println("Sie sind Normalgewichtig!");
			System.out.println("BMI:" + bmi2);
		}
		else if (gender.equals("m") && ((bmi > 25) && (bmi <= 30))){

			System.out.println("Sie sind ‹bergewichtig!");
			System.out.println("BMI:" + bmi2);
		}

		else if (gender.equals("m") && ((bmi > 30) && (bmi <= 40))){

			System.out.println("Sie haben Adipositas!");
			System.out.println("BMI:" + bmi2);
		}

		else if (gender.equals("m") && ((bmi > 40))){

			System.out.println("Sie haben eine starke Adipositas!");
			System.out.println("BMI:" + bmi2);
		}
	}
}



package Zuhause;

public class Notenvergabe {


	public static void main(String[] args) {
		
		
		for (double punkte = 0.0; punkte < 120.0; punkte += 0.5) {
			System.out.println(punkte + " -> " + Notenvergabe.getNote(punkte));
		}
	}


	// Gibt für die gegebene Anzahl Punkte (von 0 bis 120) die
	// Klausurnote zurück

	public static double getNote(double punkte) {
		double note = 5.0;

		if (50.0 <= punkte && punkte < 59.9) {
			note = 4.7;
		} else if (60.0 <= punkte && punkte < 64.9) {
			note = 4.0;
		} else if (65.0 <= punkte && punkte < 69.9) {
			note = 3.7;
		} else if (70.0 <= punkte && punkte < 75.9) {
			note = 3.3;
		} else if (75.0 <= punkte && punkte < 79.9) {
			note = 3.0;
		} else if (80 <= punkte && punkte < 84.9) {
			note = 2.7;
		} else if (85 <= punkte && punkte < 89.9) {
			note = 2.3;
		} else if (90 <= punkte && punkte < 94.9) {
			note = 2.0;
		} else if (95 <= punkte && punkte < 99.9) {
			note = 1.7;
		} else if (100 <= punkte && punkte < 104.9) {
			note = 1.3;
		} else if (105 <= punkte && punkte < 120.4) {
			note = 1.0;
		}


		return note;
	}
}



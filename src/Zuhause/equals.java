package Zuhause;

public class equals {


	public static void main(String[] args) {

		String a = new String("Hello World!");
		String b = new String("Hello World!");

		// Der �==�-Operator pr�ft auf Wert-Gleichheit
		if (a == b) {
			System.out.print("Sind gleich!");
			// Keine Text Ausgabe
		}

		// w�hrend die equals Methode auf (inhaltliche) Objekt-Gleichheit pr�ft. 
		if (a.equals(b)) {
			System.out.print("Sind gleich!");
			// Ausgabe "Sind gleich"		
		}
	}
} 

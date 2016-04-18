package Rechnen;

public class Mathematik {

	public static void main(String[] args) {
		int radius = 10;
		double flaeche = Math.pow(radius, 2) * Math.PI;
		double umsatzSteuer = 34506.74;
		// Ausgabe
		System.out.println(flaeche);
		System.out.println(Math.floor(umsatzSteuer));
		System.out.println(Math.floor(umsatzSteuer * 10) / 10);
		System.out.println(Math.min(300, flaeche));
		System.out.println(Math.max(300, flaeche));
		System.out.println(umsatzSteuer * -1);
		System.out.println(Math.abs(umsatzSteuer * -1));
		System.out.println(Math.sqrt(2));
		
		// Math.pow(x, y) x= Basis y= Exponent Liefert den Wert x hoch y
		// Math.PI Kreiszahl Pi liefert die Konstante Kreiszahl n Pi= 3,14159
		// Math.floor(x) rundet die Zahl x liefert die größte Ganzzahl, die kleiner oder gleich x ist.
		// Math.min(x,y) (gibt den Wert der kleinsten übergebenen Zahl zurück)liefert die kleinere der beiden Zahlen x und y. 
		// Math.max(x,y) liefert die größere der beiden Zahlen x und y.
		// Math.abs(x) liefert den Betrag von x (Summe)
		// Math.sqrt(x) liefert die Quadratwurzel von x sqrt= square root			
		
	}

}

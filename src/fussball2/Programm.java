package fussball2;

public class Programm {

	public static void main(String[] args) {
		
		Trainer karsten = new Trainer("Karsten", 36, 6);
		Spieler tobi = new Spieler("Tobi", 26, 9, 13, 0, 10);
		Torwart hans = new Torwart("Hans", 34, 8, 0, 5);
		tobi.setAlter(27);
		karsten.setErfahrung(7);
		System.out.println("Trainer " + "\n" + karsten.toString() + "\n" + "\nSpieler" + "\n" + tobi.toString() + "\n" + "\nTorwart" + "\n" + hans.toString());
	}

}

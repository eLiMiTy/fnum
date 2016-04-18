package Fussball;

public class Programm {

	public static void main(String[] args) {
		
		Trainer karsten = new Trainer("Karsten", 36, 6);
		Spieler tobi = new Spieler("Tobi", 26, 9, 13, 0, 10);
		tobi.setAlter(27);
		karsten.setErfahrung(7);
		System.out.println("Trainer " + "\n" +karsten.toString() + "\n" + "\nSpieler" + "\n" + tobi.toString());
	}

}

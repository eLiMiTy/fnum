package Zuhause;

public class Schleifenarten {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++){ 			// Kopfgesteuerte Schleife

			System.out.println(i + ".Zahl");

		}

		int i = 0;		
		while (i <= 10){						// Kopfgesteuerte Schleife

			System.out.println(i + ".Zahl-while");
			i++;
			
		}
		
		int b = 0;
		do {
			
			 System.out.println(b + ".Zahl-do,while");
			 b++;
			 
		}while (b <= 10);						// Fußgesteuerte Schleife
	}
}

// Schleifendurchlauf = Die Schleife läuft 1x durch
// Schleifenarten = For, while, do-while
// for (int i=0; i<7; i++) -> Schleifenkopf
// for (initialisierung, Deklarierung, Abbruchbedingung, Erhöhung der Laufvariablen = inkrementieren oder Senkung der Laufvariablen(i--) = dekrementieren)
// {System.out.println(i + ".Zahl");} -> Schleifenkörper/-rumpf (Block)
// break = stoppt Programm mittendrin
// continue = weiterführen
// mehrere Variabelen = Verschachtelung 
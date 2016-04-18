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
			 
		}while (b <= 10);						// Fu�gesteuerte Schleife
	}
}

// Schleifendurchlauf = Die Schleife l�uft 1x durch
// Schleifenarten = For, while, do-while
// for (int i=0; i<7; i++) -> Schleifenkopf
// for (initialisierung, Deklarierung, Abbruchbedingung, Erh�hung der Laufvariablen = inkrementieren oder Senkung der Laufvariablen(i--) = dekrementieren)
// {System.out.println(i + ".Zahl");} -> Schleifenk�rper/-rumpf (Block)
// break = stoppt Programm mittendrin
// continue = weiterf�hren
// mehrere Variabelen = Verschachtelung 
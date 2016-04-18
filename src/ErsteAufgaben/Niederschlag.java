package ErsteAufgaben;

public class Niederschlag {

	public static void main(String[] args) {
		// Deklaration der benötigten Variablen
		double april;
		double mai;
		double juni;
		double durchschnitt;
		
		
		// Wertzuweisung
		april = 12;
		mai = 14;
		juni = 8;
		durchschnitt = april * mai * juni/3;
		
		// Rechnung
		System.out.println("Durchschnitt in 1 Schritt " +  april * mai * juni / 3);
		
		System.out.println("Durchschnitt in zwei Schritten " + durchschnitt  ) ;	
	}

}

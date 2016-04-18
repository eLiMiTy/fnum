package Runden;

public class Runden {

	public static double runden(double wert, int stellen) {
		double p = Math.pow(10, stellen);
		return Math.round(wert * p) / p;
	}

	public static double runden(double wert) {
		return Math.round(wert * 100.0) / 100.0;
	}


}

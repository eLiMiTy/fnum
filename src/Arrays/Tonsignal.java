package Arrays;

public class Tonsignal {

	public static void main(String[] args) {

		int[] signal = {5, 5, 4, 5, 6, 6, 7, 6, 8, 4, 5, 7, 1};
		int[] geglaettet = new int[signal.length];

		geglaettet[0] = (signal[0] + signal[1]) / 2;
		geglaettet[ signal.length-1 ] = (signal[signal.length-2] + signal[signal.length-1]) / 2;

		for (int j = 1; j < geglaettet.length-1; j++) {
			geglaettet[j] = (signal[j-1] + signal[j] + signal[j+1]) / 3;

		}
		for (int i = 0; i < geglaettet.length; i++) {
			System.out.println(signal[i]);
		}
		System.out.println("\n------------------------------------------");
		for (int k = 0; k < geglaettet.length; k++) {
			System.out.println(geglaettet[k]);
		}
	}

}

package Arrays;

public class Calculate extends Statistikrechner {

	private static final long serialVersionUID = 1L;
	private static double[] xj1 = new double[Statistikrechner.xj1.size()];
	private static double[] xj2 = new double[Statistikrechner.xj2.size()];
	private static double[] hj = new double[Statistikrechner.hj.size()];

	private static double[] frequency = new double[Statistikrechner.hj.size()];
	private static double[] fm = new double[Statistikrechner.hj.size()];
	private static boolean constantClassRange;

	private static void initializeArrays() {
		for(int i = 0;i < Statistikrechner.xj1.size();i++) {
			xj1[i] = Statistikrechner.xj1.get(i);
			if (kDataJRadio.isSelected()) xj2[i] = Statistikrechner.xj2.get(i);
			hj[i] = Statistikrechner.hj.get(i);
		}
	}

	private static boolean calculateClassRange() {
		initializeArrays();
		int count = 0;
		if(kDataJRadio.isSelected()) {
			double first = xj2[0] - xj1[0];
			for(int i = 0;i < Statistikrechner.xj2.size();i++) {
				if ((xj2[i] - xj1[i]) == first) {
					count++;
				}
			}
		}

		if (count == Statistikrechner.xj1.size()) {
			constantClassRange = true;
			return true;
		} else {
			constantClassRange = false;
			return false;
		}

	}

	public static double calculateArith() {
		double arith = 0;
		double d = 0;
		if (gDataJRadio.isSelected()) {
			for (int i = 0;i < Statistikrechner.hj.size();i++) {
				arith += hj[i] * xj1[i];
			}

			for (int i = 0;i < Statistikrechner.xj1.size();i++) {
				d += xj1[i];
			}
			arith /= d;

		} else if (kDataJRadio.isSelected()) {
			calculateFrequency();
			for(int i = 0;i < Statistikrechner.hj.size();i++) {
				arith += hj[i] * frequency[i];
			}

			for (int i = 0;i < Statistikrechner.xj1.size();i++) {
				d += xj2[i];
			}
			arith /= Hj.get(Hj.size()-1);
		}
		return Math.round(arith * 1000.0) / 1000.0;
	}

	public static double calculateStdDeviation() {
		return Math.sqrt(calculateVariance());
	}

	public static double calculateMedian() {
		double median = 0;
		int pos = calculatePos(2);
		if (pos < 1) {
			return 0;
		} 

		if (kDataJRadio.isSelected()) {
			median = (Hj.get(Hj.size()-1)/2);
			median -= Hj.get(pos-1);
			median /= hj[pos];
			median *= xj2[pos] - xj1[pos];
			median += xj1[pos];

		} else if (gDataJRadio.isSelected()) {
			median = Hj.get((Hj.size()-1)/2);
		}

		return Math.round(median * 1000.0) / 1000.0;
	}

	public static double calculateModus() {
		double modus = 0;
		calculateClassRange();
		int m = calculateModalClass(); 
		if (kDataJRadio.isSelected() && constantClassRange == true) {
			double modus2 = 0;
			double modus3 = 0;
			modus2 = hj[m]-hj[m-1];
			modus3 = (hj[m]-hj[m-1]) + (hj[m]-hj[m+1]);
			modus2 /= modus3;
			modus += modus2;
			modus *= (xj2[m]-xj1[m]);
			modus += xj1[m];

		} else if (kDataJRadio.isSelected() && constantClassRange == false) {
			for(int i = 0;i < Statistikrechner.xj1.size();i++) {
				fm[i] =  hj[m] /(xj2[m] - xj1[m]);
			}

			modus = fm[m]-fm[m-1];
			modus /= (fm[m]-fm[m-1]) + (fm[m]-fm[m+1]);
			modus *= (xj2[m]-xj1[m]);
			modus += xj1[m];

		} else if (gDataJRadio.isSelected()) {
			modus = 0;
			for(int i = 0; i < Statistikrechner.hj.size(); i++) {
				if (hj[i] > modus) {
					modus = hj[i];
				}

			}

		}

		return Math.round(modus * 1000.0) / 1000.0;
	}

	public static double calculateVariance() {
		calculateFrequency();
		double variance = 0, arith = calculateArith(), d = 0;;
		if (gDataJRadio.isSelected()) {
			for(int i = 0;i < Statistikrechner.hj.size();i++) {
				variance += (Math.pow(xj1[i] - arith, 2)) * hj[i];
			}

			variance /= Hj.get(Hj.size()-1);

		} else if (kDataJRadio.isSelected()) {
			for(int i = 0;i < Statistikrechner.hj.size();i++) {
				variance += (Math.pow(frequency[i] - arith, 2)) * hj[i];
			}

			variance /= Hj.get(Hj.size()-1);

		}
		return Math.round(variance * 1000.0) / 1000.0;
	}

	public static double[] calculateFrequency() {
		for(int i = 0;i < Statistikrechner.xj1.size();i++) {
			frequency[i] = (xj2[i] + xj1[i]) / 2;
		}
		return frequency;
	}

	public static double[] calculateFrequencyModus() {
		if (!constantClassRange) {
			int m = calculateModalClass();
			for(int i = 0;i < Statistikrechner.xj1.size();i++) {
				fm[i] =  hj[m] /(xj2[m] - xj1[m]);
			}
		}
		return fm;

	}

	public static int calculateModalClass() {
		double max = 0;
		int maxClass = 0;
		for(int i = 0; i < Statistikrechner.hj.size();i++) {
			if (hj[i] > max) {
				max = hj[i];
			}
		}

		for(int i = 0; i < Statistikrechner.hj.size(); i++) {
			if (max == hj[i]) {
				maxClass = i;
			}
		}

		return maxClass;
	}

	public static double calculateCqd() {
		return calculateQ3() - calculateQ1();
	}

	public static double calculateQ1() {
		double q1;
		try {
			q1 = 0;
			int pos = calculatePos(4);

			if (pos < 1) {
				return 0;
			}

			if (kDataJRadio.isSelected()) {
				q1 = (Hj.get(Hj.size()-1)/2);
				q1 -= Hj.get(pos-1);
				q1 /= hj[pos];
				q1 *= xj2[pos] - xj1[pos];
				q1 += xj1[pos];

			} else if (gDataJRadio.isSelected()) {
				q1 = Hj.get(Hj.size()-1);
			}

		} catch (Exception e) {
			return 0;
		}
		return Math.round(q1 * 1000.0) / 1000.0;
	}

	public static double calculateQ3() {
		double q3;
		try {
			q3 = 0;
			int pos = calculatePos(0.75);

			if (pos < 1) {
				return 0;
			} 

			if (kDataJRadio.isSelected()) {
				q3 = (Hj.get(Hj.size()-1)/2);
				q3 -= Hj.get(pos-1);
				q3 /= hj[pos];
				q3 *= xj2[pos] - xj1[pos];
				q3 += xj1[pos];

			} else if (gDataJRadio.isSelected()) {
				q3 = Hj.get(Hj.size()-1);
			}

		} catch (Exception e) {
			return 0;
		}
		return Math.round(q3 * 1000.0) / 1000.0;
	}

	public static int calculatePos(double p) {
		double max = 0;
		for (int i = 0;i < Statistikrechner.hj.size();i++) {
			max += hj[i];
		}

		int pos = (int) (max / p);
		int mediClass = 0;

		for(int i = 0; i < Statistikrechner.hj.size(); i++) {
			if (pos >= Hj.get(i)) {
				mediClass = i;
			}
		}

		return mediClass;
	}

	public static String outputResults() {
		initializeArrays();
		calculateClassRange();
		String str =
				"Konstante Klassenbreite: " +constantClassRange
				+"\nModus: \t" +calculateModus()
				+"\nModalklasse: \t" +(calculateModalClass()+1)
				+"\nMedian: \t" +calculateMedian()
				+"\nArith. Mittel: \t" +calculateArith()
				+"\nVarianz: \t" +calculateVariance()
				+"\nStandartabw.: \t" +calculateStdDeviation()
				+"\nQuartile:"
				+"\n  Q1: \t" +calculateQ1()
				+"\n  Q3: \t" +calculateQ3()
				+"\nZQA: \t" +calculateCqd();
		return str;
	}

}

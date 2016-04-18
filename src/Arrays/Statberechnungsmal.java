package Arrays;

import java.util.Arrays;

public class Statberechnungsmal {
	
		
		public static double ermittelMin(double[] array) {
			Arrays.sort(array);
			double min = array[0];
			return min;
		}
		
		public static double ermittleMax(double[] array) {
			Arrays.sort(array);
			double max = array[array.length-1];
			return max;
		}
		
		public static double berechneArith(double[] array) {
			Arrays.sort(array);
			double arith = 0;
			for(int i = 0;i < array.length;i++) {
				arith += array[i];
			}
			arith /= array.length;
			return arith;
		}
		
		public static double berechneVarianz(double[] array) {
			Arrays.sort(array);
			double varianz = 0, arith = 0;
			arith = berechneArith(array);
			for(int i = 0;i < array.length;i++) {
				varianz += Math.pow(array[i] - arith, 2);
			}
			varianz /= array.length;
			return varianz;
		}
		
		public static double berechneStandartAbw(double[] array) {
			Arrays.sort(array);
			double varianz = 0, stdAbw = 0;
			varianz = berechneVarianz(array);
			varianz /= array.length;
			stdAbw = Math.sqrt(varianz);
			return stdAbw;
		}

	}


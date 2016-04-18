package Arrays;

import java.io.IOException;
import java.lang.reflect.Array;

import oop.IO;

public class AuswertungDatenreihe1 {

	public static void main(String[] args) throws IOException {
		double[] arr = IO.readDoubleArray();
		System.out.println("MAX wert = " + ermittelMax(arr));
		System.out.println("MIN wert = " + ermittelMin(arr));	
		System.out.println("MITTEL wert = " + berechneMittelwert(arr));
	}

	public static double ermittelMax(double[] arr) throws IOException {

		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static double ermittelMin(double[] arr) throws IOException {

		double min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static double berechneMittelwert(double[] arr) {
		double mitte = arr[0];
		for (int i = 1; i < arr.length; i++) {
			mitte = mitte + arr[i];
		}
		int n = arr.length;
		mitte = mitte/n;
		return mitte;
	}
}


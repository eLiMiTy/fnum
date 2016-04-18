package Arrays;

import java.io.IOException;

import oop.IO;

public class Maxima {

	public static void main(String[] args) throws IOException {
		double[] arr = IO.readDoubleArray();

		double max = arr[0]; 
		double max2 = arr[0];



		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max2 = max; 
				max = arr[i];
			}else if(arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println("die Größte zahl ist "+ max +" und die zweit Größte zahl ist: " +max2);
	}

}

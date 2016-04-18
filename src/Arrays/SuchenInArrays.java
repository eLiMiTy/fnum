package Arrays;

import java.io.IOException;

import oop.IO;

public class SuchenInArrays {

	public static void main(String[] args) throws IOException{
		double[] array = IO.readDoubleArray(5);

		System.out.println("Nach welcher Zahl wollen sie suchen?");
		double target = IO.readDouble();

		for(int i= 0; i < array.length; i++){
			if(array[i] == target) {
				System.out.println("Treffer :)");
			} else{
				System.out.println("Niete :(");
			}
		}
	}
}
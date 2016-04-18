package Arrays;

import java.io.IOException;

public class FestesArray {

	public static void main(String[] args) throws IOException {

		int arrfest[] = new int [5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Geben Sie die " +(i+1)+ ". Zahl ein: ");
			arrfest[i] = oop.IO.readInteger();
		}
		
		for(int i = 0; i < 5; i++){

			System.out.println(arrfest[i]);
		}
	}
}
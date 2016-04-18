package Arrays;

import java.io.IOException;
import java.util.Arrays;

import oop.IO;

public class Testprogramm {

	public static void main(String[] args) throws IOException {
		int[] text;

		text = VariablesArrayMethoden.einlesenZahlen();
		
		VariablesArrayMethoden.ausgebenZahlen(text);
		
	}
}
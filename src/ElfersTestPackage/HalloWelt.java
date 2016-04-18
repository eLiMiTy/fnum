package ElfersTestPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalloWelt {

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Hallo Welt!");
		Thread.sleep(1000);
		
		System.out.println("Welche Klasse besuchst Du? ");
		String klasse = br.readLine();
		if (klasse.equalsIgnoreCase("dqm15")) {
			System.out.println("Herzlichen Glückwunsch!");
		}
		else {
			System.out.println("Mein Beileid!");
		}
	}

}

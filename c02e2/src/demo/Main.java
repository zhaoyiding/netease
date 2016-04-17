package demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] readability={"unreadable",
				"barely readable, occasional words distinguishable",
				"readable with considerable difficulty",
				"readable with practically no difficulty",
				"perfectly readable"};	
		String[] strength={"Faint signals, barely perceptible",
				"Very weak signals",
				"Weak signals",
				"Fair signals",
				"Fairly good signals",
				"Good signals",
				"Moderately strong signals",
				"Strong signals",
				"Extremely strong signals"
		};
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int r = num / 10;
		int s = num % 10;
		System.out.println(strength[s-1]+", "+readability[r-1]+".");
		
		in.close();
	}

}

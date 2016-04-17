package e1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0, numOfOdd = 0, numOfEven = 0;
		while ((n = in.nextInt()) != -1) {
			if (n % 2 == 1) {
				numOfOdd++;
			} else {
				numOfEven++;
			}
		}
		System.out.printf("%d %d", numOfOdd, numOfEven);
		in.close();
	}

}

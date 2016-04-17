package demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bjt = in.nextInt();

		int hour = bjt / 100;
		int min = bjt % 100;

		if (hour > 8) {
			System.out.printf("%d%02d", hour - 8, min);
		} else if (hour == 8) {
			System.out.printf("%d", min);
		} else {
			System.out.printf("%d%02d", hour + 16, min);
		}

		in.close();
	}

}

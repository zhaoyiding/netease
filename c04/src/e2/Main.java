package e2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] table = new int[100][100];
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				table[i][j] = in.nextInt();
			}
		}

		boolean flag3 = true, flag4 = true;
		for (int i = 0; i < n; i++) {

			boolean flag1 = true, flag2 = true;
			for (int j = 1; j < n; j++) {
				if (table[i][0] != table[i][j]) {
					flag1 = false;
				}
				if (table[0][i] != table[j][i]) {
					flag2 = false;
				}
				if (!flag1&&!flag2) {
					break;
				}
			}

			if (flag1) {
				System.out.println(table[i][0] == 1 ? "X" : "O");
				in.close();
				return;
			}
			if (flag2) {
				System.out.println(table[0][i] == 1 ? "X" : "O");
				in.close();
				return;
			}

			if (table[0][0] != table[i][i]) {
				flag3 = false;
			}
			if (table[0][n - 1] != table[i][n - 1 - i]) {
				flag4 = false;
			}

		}

		if (flag3) {
			System.out.println(table[0][0] == 1 ? "X" : "O");
		} else if (flag4) {
			System.out.println(table[0][n - 1] == 1 ? "X" : "O");
		} else {
			System.out.println("NIL");
		}

		in.close();
	}

}

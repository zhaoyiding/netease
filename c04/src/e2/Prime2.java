package e2;

import java.util.ArrayList;
import java.util.List;

public class Prime2 {

	public static void main(String[] args) {
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(2);

		OUTER:
		for (int i = 3; i < 100; i += 2) {
			for (int j : prime) {
				if (i % j == 0) {
					continue OUTER;
				}
			}
			prime.add(i);
		}

		for (Integer integer : prime) {
			System.out.print(integer + " ");
		}
	}

}

package e2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// 取该非负整数
		int sum = 0;// 输出的二进制数值
		int weight = 1;// 二进制各位权值
		int index = 1;// 十进制从右往左分解序号
		int bit = 0;// 十进制从右往左分解各位数字
		/*
		 * 推出条件n>0，可以取到最高位 更新条件包括：1、十进制数向右移一位 2、二进制数位向左移，位权值*2 3、十进制数位序号加1
		 */
		for (; n > 0; n /= 10, weight *= 2, index++) {
			bit = n % 10;// 取十进制各个位的数字
			if (bit % 2 == index % 2) {
				// 奇偶性相同，和加上当前为权值
				sum += weight;
			}
		}
		System.out.println(sum);
		in.close();
	}

}

package net.zhaoyiding.netease.exercise.c01.e1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int f = in.nextInt();
		System.out.println((int) ((f - 32) / 1.8));
		in.close();
	}

}

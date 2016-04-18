package e1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(), in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5, 6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {

	private int member;
	private int denominator;

	public Fraction(int member, int denominator) {
		super();
		int factor = commonFactor(member, denominator);
		member /= factor;
		denominator /= factor;
		this.member = member;
		this.denominator = denominator;
	}

	public double toDouble() {
		return (double) member / denominator;
	}

	private int commonFactor(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public Fraction plus(Fraction fraction) {
		int mem = this.member * fraction.denominator + this.denominator * fraction.member;
		int den = this.denominator * fraction.denominator;
		int factor = commonFactor(mem, den);
		mem /= factor;
		den /= factor;
		return new Fraction(mem, den);
	}

	public Fraction multiply(Fraction fraction) {
		int mem = this.member * fraction.member;
		int den = this.denominator * fraction.denominator;
		int factor = commonFactor(mem, den);
		mem /= factor;
		den /= factor;
		return new Fraction(mem, den);
	}

	public void print() {
		if (member%denominator==0) {
			System.out.println(member/denominator);
		} else {
			System.out.println(member + "/" + denominator);
		}
	}
}
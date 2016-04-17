package e3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int begin=in.nextInt();
		int end=in.nextInt();
		int index=0;
		int sum=0;
		for(int n=2;;n++){
			if (isPrime(n)) {
				index++;
				if (index>=begin&&index<=end) {
					sum+=n;
					if (index==end) {
						break;
					}
				}
			}
		}
		System.out.println(sum);
		in.close();
	}
	
	private static boolean isPrime(int n){
		if (n==2) {
			return true;
		} else if (n%2==1) {
			int i=3;
			for(;i*i<=n;i+=2){
				if (n%i==0) {
					break;
				}
			}
			if (i*i>n) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
}

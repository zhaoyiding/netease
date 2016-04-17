package e3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int begin=in.nextInt(),end=in.nextInt();
		
		int sum=0;
		int index=1;
		
		for(int n=2; ;n++){
			if (n==2) {
				if (index==begin) {
					sum+=n;
				}
				if (index==end) {
					break;
				}
			}
			if (n%2==1) {
				int i=3;
				for(;i*i<=n;i+=2){
					if (n%i==0) {
						break;
					}
				}
				
				if (i*i>n) {
					index++;
					if (index>=begin&&index<=end) {
						sum+=n;
						if (index==end) {
							break;
						}
					}
					
				}
			}
		}
		System.out.println(sum);
		in.close();
	}

}

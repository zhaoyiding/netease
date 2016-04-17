package e1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] poly=new int[101];
		Scanner in=new Scanner(System.in);
		int e=0,c=0;
		int ct=0;
		
		while(ct<2){
			e=in.nextInt();
			c=in.nextInt();
			poly[e]+=c;
			if (e==0) {
				ct++;
			}
		}
		
		boolean flag=true, zero=true;
		for (int i = 100; i >= 1; i--) {
			int coef=poly[i];
			if (coef!=0) {
				zero=false;
				if (flag) {
					flag=false;
					if (coef==1) {
						System.out.print("x");
					} else if(coef==-1){
						System.out.print("-x");
					} else {
						System.out.printf("%dx",coef);
					}
					
					if (i>1) {
						System.out.print(i);
					}
				}else {
					if (coef==1) {
						System.out.print("+x");
					} else if(coef==-1){
						System.out.print("-x");
					} else {
						System.out.printf("%+dx",coef);
					}
					
					if (i>1) {
						System.out.print(i);
					}
				}
				
			}
			
		}
		
		if (zero) {
			if (poly[0]==0) {
				System.out.print(0);
			} else {
				System.out.printf("%d",poly[0]);
			}
			
		} else if (poly[0]!=0) {
			System.out.printf("%+d",poly[0]);
		}
		
		in.close();
		
	}

}

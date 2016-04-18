package e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public boolean check(int n) {
		if (n==1) {
			return false;
		}
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i*i<=n;i++){
			if (n%i==0) {
				list.add(i);
				int d=n/i;
				if (i!=d&&d!=n) {
					list.add(d);
				}
			}
		}
		int sum=0;
		for (Integer integer : list) {
			sum+=integer;
		}
		if (sum==n) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int lower=in.nextInt();
		int upper=in.nextInt();
		boolean flag=true;
		Main main=new Main();
		for(int i=lower;i<=upper;i++){
			if (main.check(i)) {
				if (flag) {
					flag=false;
				} else {
					System.out.print(" ");
				}
				System.out.print(i);
			}
		}
		if (flag) {
			System.out.print("NIL");
		}
		in.close();
	}

}

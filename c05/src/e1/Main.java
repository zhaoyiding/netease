package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public boolean[] getPrimeList(int n) {
		boolean[] primeList=new boolean[n+1];
		for (int i = 1; i < primeList.length; i++) {
			primeList[i]=true;
		}
		
		for(int i=2;i<=n/2;i++){
			for(int j=2;i*j<=n;j++){
				primeList[i*j]=false;
			}
		}
		return primeList;
	}
	
	public List<Integer> factor(int n,boolean[] primeList) {
		List<Integer> result=new ArrayList<Integer>();
		while(!primeList[n]){
			for(int i=2;i<primeList.length;i++){
				if (primeList[i]&&n%i==0) {
					result.add(i);
					n/=i;
					break;
				}
			}
		}
		result.add(n);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Main main=new Main();
		boolean[] primeList=main.getPrimeList(n);
		List<Integer> result=main.factor(n, primeList);
		System.out.print(n+"=");
		boolean flag=true;
		for(int i:result){
			if (flag) {
				flag=false;
			}else {
				System.out.print("x");
			}
			System.out.print(i);
		}
		in.close();
	}

}

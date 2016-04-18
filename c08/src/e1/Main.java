package e1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> city=new HashMap<String,Integer>();
		Scanner in=new Scanner(System.in);
		String s;
		int n=0;
		while(!(s=in.next()).equals("###")){
			city.put(s, n);
			n++;
		}
		int[][] distance=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				distance[i][j]=in.nextInt();
			}
		}
		String a=in.next();
		String b=in.next();
		int i=city.get(a);
		int j=city.get(b);
		System.out.println(distance[i][j]);
		in.close();
	}

}

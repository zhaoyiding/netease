package e4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		String[] pinyin={
				"ling","yi","er","san","si","wu","liu","qi","ba","jiu"
		};
		Stack<String> stack=new Stack<String>();
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		boolean flag=true;
		
		if (n==0) {
			System.out.print("ling");
			in.close();
			return;
		}
		
		if (n<0) {
			System.out.print("fu");
			n=-n;
			flag=false;
		}
		
		while(n>0){
			int bit=n%10;
			n/=10;
			stack.push(pinyin[bit]);
		}
		
		while(!stack.isEmpty()){
			if (flag) {
				flag=false;
			} else {
				System.out.print(" ");
			}
			System.out.print(stack.pop());
		}
		
		in.close();
	}

}

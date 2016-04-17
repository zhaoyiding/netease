package e2;

public class Prime1 {

	public static void main(String[] args) {
		boolean[] prime=new boolean[100];
		for (int i = 0; i < prime.length; i++) {
			prime[i]=true;
		}
		
		for(int i=2;i<prime.length;i++){
			if (prime[i]) {
				for (int j = 2; i*j<prime.length; j++) {
					prime[i*j]=false;
				}
			}
		}
		
		for (int i = 2; i < prime.length; i++) {
			if (prime[i]) {
				System.out.print(i+" ");
			}
			
		}

	}

}

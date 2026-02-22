package pratica_fibonacci;

public class ComRecursividade {
		
	public static void main(String[] args) {
		int n = 10;
		int m=2;
		int fib=fibo(m,n);
	}
	public static int fibo(int m,int n) {
		int z ;
		if(n==0) {
			return 1;
		}
		
	
		
		return z=(m*fibo(m,n-1));
		
	}
}

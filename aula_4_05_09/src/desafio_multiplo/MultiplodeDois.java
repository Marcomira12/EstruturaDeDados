package desafio_multiplo;

public class MultiplodeDois {

	public static void main(String[] args) {
		
		int n=15;
		int d=	2;
		int resultado= multiplo (d,n);
		
	}
	public static int multiplo(int d,int n) {
		
		if(n==0) {
			return 1;
		}
		System.out.println(d);
		
		return multiplo(d+2,n-1);
	}
}

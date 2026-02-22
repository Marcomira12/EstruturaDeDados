package questao2;

import java.util.Scanner;

public class Recursividade {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(recursividade(n));
		
		
		sc.close();

	}
	public static int recursividade(int n) {
		if(n==1) {
			return 1;
		}
		
		return n+recursividade(n-1);
	}
}

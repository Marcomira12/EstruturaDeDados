package pratica_fibonacci;

import java.util.Scanner;

public class SemRecursividade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i=10;
		int soma=0;
		int n=1;
		int a=0,b=1,c;
		while(i!=0) {
			
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			i--;
		}
		
		sc.close();

	}

}

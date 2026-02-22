package questao_1;

import java.util.Scanner;

public class Mdc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cont=2;
		System.out.println(maximoDivisor(12,18,cont));
		
		
		
		sc.close();
	}
	public static int maximoDivisor(int n, int m, int cont) {
	    if (cont > n || cont > m) {
	        return 1; 
	    }
	    if (n % cont == 0 && m % cont == 0) {
	        return cont * maximoDivisor(n/cont, m/cont, cont); 
	       
	    }
	    return maximoDivisor(n, m, cont + 1);
	}
}

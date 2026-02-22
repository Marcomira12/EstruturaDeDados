package Questoes2;

import java.util.Scanner;

public class Recursividade {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		imprimir(n);
		
		sc.close();
	}
	public static int imprimir(int n) {
        if (n <= 0) {
        	return n;
        }
        imprimir(n - 1);
        System.out.print(n + " ");
		return n;
    }
	
		
	
}

package questao_4;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String numero= sc.nextLine();
		System.out.println(somar(numero));
		
		sc.close();

	}
	public static int somar(String numero) {
	    return somar(numero, 0);
	}

	
	private static int somar(String numero, int i) {
	    if (i == numero.length() - 1) {
	        return numero.charAt(i) - '0'; 
	    }
	    return (numero.charAt(i) - '0') + somar(numero, i + 1);
	}
}

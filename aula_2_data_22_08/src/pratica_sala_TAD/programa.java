package pratica_sala_TAD;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Cliente cl= new Cliente("marco",10);
		System.out.println(cl.getNome());
		
		cl.setNome(sc.nextLine());
		
			
		System.out.println(cl.getNome());
		
		sc.close();
	}

}

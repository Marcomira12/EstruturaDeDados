package EX2;

import java.util.Scanner;


public class Callcenter {
	public static void main(String[] args) {
		Fila fila= new Fila();
		Scanner sc= new Scanner(System.in);
		int op;
		do {
			System.out.println("Inserir contato - 1");
			System.out.println("atender proximo - 2");
			System.out.println("Sair- 3");
			op=sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:
				System.out.println("Inserir contato");
				String nome=sc.nextLine();
				int n=sc.nextInt();
				fila.inserirFila(nome,n);
				break;
			case 2:
				System.out.println("atender cliente ");
				fila.mostrar();
				fila.removerFila();
				break;
			case 3:
				System.out.println("Programa encerrado");
				break;
				default:
					System.out.println("Opção invalida");
			}
			
			
		}while(op!=4);
		
		sc.close();
	}
}

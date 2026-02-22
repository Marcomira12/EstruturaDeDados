package EX1;

import java.util.Scanner;

import Lista_Fila.Fila;

public class Playlist {

	public static void main(String[] args) {
		Fila fila= new Fila();
		Scanner sc= new Scanner(System.in);
		int op;
		do {
			System.out.println("Inserir musica - 1");
			System.out.println("Consultar música - 2");
			System.out.println("Remover música- 3");
			System.out.println("Sair- 4");
			op=sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:
				System.out.println("Inserir musica");
				String musica=sc.nextLine();
				fila.inserirFila(musica);
				break;
			case 2:
				System.out.println("Consultar lista");
				fila.mostrar();
				break;
			case 3:
				System.out.println("Remover ");
				fila.removerFila();
				System.out.println("Removido com sucesso!");
				break;
			case 4:
				System.out.println("Programa encerrado");
				break;
				default:
					System.out.println("Opção invalida");
			}
			
			
		}while(op!=4);
		
		sc.close();
	}
	
}

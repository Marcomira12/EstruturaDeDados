package Ex3;

import java.util.Scanner;

public class TesteEx3 {
	public static void main(String[] args) {
		Fila fila = new Fila();
		Scanner sc= new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("========= MENU =========");
			System.out.println("1 - Inserir tarefa");
			System.out.println("2 - mostrar proxima tarefa");
			System.out.println("3 - Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Inserir tarefa");
				String tarefa=sc.nextLine();
				fila.inserirFila(tarefa);
				break;

			
			case 2:
				fila.mostrar();
				break;

			case 3:
				System.out.println("Saindo");
				break;

			default:
				System.out.println("Opcao inválida! Tente novamente.");
			}
			

		} while (opcao != 3);
	
		sc.close();
	}
	
}

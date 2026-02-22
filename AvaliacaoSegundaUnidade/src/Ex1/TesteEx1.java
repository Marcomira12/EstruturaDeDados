package Ex1;

import java.util.Scanner;

public class TesteEx1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Arvore arvore= new Arvore();
		int opcao;
		do {
			System.out.println("========= MENU =========");
			System.out.println("1 - Inserir elemento");
			System.out.println("2 - mostrar em PreOrdem");
			System.out.println("3 - Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				if(arvore.getQuantidade()==10) {
					System.out.println("Não pode mais inserir");
					break;
				}
				System.out.print("Digite o elemento: ");
				int valor = sc.nextInt();
				arvore.inserirElemento(valor);
				
				break;

			
			case 2:
				System.out.println("Percurso Pre-Ordem:");
				arvore.mostrarPreOrdem();
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

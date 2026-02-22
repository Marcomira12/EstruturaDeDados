package Lista_Pilha;

import java.util.Iterator;
import java.util.Scanner;

public class Livros {

	public static void main(String[] args) throws PilhaVaziaException {
		PilhaEncadeada<String> pilha = new PilhaEncadeada<>();
		
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("===== MENU =====");
			System.out.println("1 - Inserir na Pilha");
			System.out.println("2 - Consultar na Pilha");
			System.out.println("3 - Remover na Pilha");
			System.out.println("4 - Esvaziar na Pilha");
			System.out.println("5 - Encerrar");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
		
			switch (opcao) {
				case 1:
					System.out.println("Adicionar livro");
					String li = sc.nextLine();
	                pilha.push(li);
	                System.out.println("Livro adicionado!");
					break;
	
				case 2:
					System.out.println("Consultar pilha");
					Iterator<String> it = pilha.iterator();
					while (it.hasNext()) {
						System.out.println(it.next());
					}
					break;
	
				case 3:
					System.out.println("removendo");
					pilha.pop();
					
					
					break;
	
				case 4:
					System.out.println("Limpar");
					pilha.clear();
					break;
	
				case 5:
					System.out.println("Encerrando o programa...");
					break;
	
				default:
					System.out.println("Opção inválida! Tente novamente.");
				}

		} while (opcao != 5);

		sc.close();
	}

}

package Ex1;

import java.util.Scanner;

public class TesteArvore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Arvore<Integer> arvore = new Arvore<>();

		
		int[] valores = { 5, 3, 9, 4, 7, 11 };
		for (int v : valores) {
			arvore.inserir(v);
		}

		int op;

		do {
			System.out.println("===== MENU ÁRVORE =====");
			System.out.println("1 - Caminhamento central (esquerda)");
			System.out.println("2 - Caminhamento pré-fixado (direita)");
			System.out.println("3 - Caminhamento pós-fixado (esquerda)");
			System.out.println("4 - Mostrar nós folhas");
			System.out.println("5 - Mostrar raiz e seus filhos");
			System.out.println("0 - Sair");
			System.out.print("Escolha: ");

			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.print("Central (E-R-D): ");
				arvore.caminhamentoCentral();
				break;

			case 2:
				System.out.print("Pré-fixado à direita (R-D-E): ");
				arvore.caminhamentoPreDireita();
				break;

			case 3:
				System.out.print("Pós-fixado à esquerda (E-D-R): ");
				arvore.caminhamentoPosEsquerda();
				break;

			case 4:
				System.out.print("Nós folhas: ");
				arvore.mostrarFolhas();
				break;

			case 5:
				arvore.mostrarRaizEFilhos();
				break;

			case 0:
				System.out.println("Encerrando");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (op != 0);

		sc.close();
	}

}

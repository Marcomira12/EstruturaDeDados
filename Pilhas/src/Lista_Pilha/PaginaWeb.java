package Lista_Pilha;

import java.util.Iterator;
import java.util.Scanner;

public class PaginaWeb {

	public static void main(String[] args) throws PilhaVaziaException {
		PilhaEncadeada<String> pilha = new PilhaEncadeada<>();

		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Adicionar elemento - 1");
			System.out.println("iniciarlizar- 2 ");
			System.out.println("remover- 3");
			System.out.println("Encerrar- 4");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("adicionar elemento");
				String m = sc.nextLine();
				pilha.push(m);
				break;

			case 2:
				pilha.clear();
				System.out.println("Inicializado");
				break;
			case 3:
				System.out.println("remover elemento");
				pilha.pop();
				break;
			default:
					System.out.println("de novo");
				break;
			}
		} while (op != 4);

	}

}

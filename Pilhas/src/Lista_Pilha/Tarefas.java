package Lista_Pilha;

import java.util.Iterator;
import java.util.Scanner;

public class Tarefas {

	public static void main(String[] args) {
		PilhaEncadeada<String> pilha = new PilhaEncadeada<>();

		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Adicionar tarefa- 1");
			System.out.println("Obter tarefa- 2 ");
			System.out.println("Encerrar- 3");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("Escreva tarefa");
				String m = sc.nextLine();
				pilha.push(m);
				break;

			case 2:
				System.out.println("Obter tarefa");
				Iterator<String> it = pilha.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 3:
				System.out.println("Acabou");
				break;
			default:
					System.out.println("de novo");
				break;
			}
		} while (op != 3);

	}

}

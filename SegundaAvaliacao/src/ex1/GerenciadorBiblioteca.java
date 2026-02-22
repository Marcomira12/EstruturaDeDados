package ex1;

import java.util.Scanner;

public class GerenciadorBiblioteca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fila emprestimo = new Fila();
		Pilha devolucao = new Pilha();
		int op;
		do {
			System.out.println("1 - Solicitar Empréstimo - chamar o método solicitar Emprestimo");
			System.out.println("2 - Emprestar Livro - chamar o método emprestar Livro");
			System.out.println("3 - Devolver Livro - chamar o método devolver Livro");
			System.out.println("4 - Listar Pedidos - chamar o método listarPedidosEmprestimo");
			System.out.println("5 - Listar Devoluções - chamar o método listarHistorico Devolucoes");
			System.out.println("6 - Sair");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("Digite qual o nome do livro: ");
				String livro = sc.nextLine();
				emprestimo.solicitarEmprestimo(livro);
				System.out.println(" Solicitado com sucesso");
				break;
			case 2:
				emprestimo.emprestarLivro();
				break;
			case 3:
				System.out.println("Digite o nome do livro devolvido");
				String devo = sc.nextLine();
				devolucao.devolverLivro(devo);
				break;
			case 4:
				System.out.println("Todos os pedidos de emprestimo");
				emprestimo.listarPedidosEmprestimo();
				break;
			case 5:
				System.out.println("Histórico e devolução");
				devolucao.listarHistoricoDevolucoes();
				break;
			case 6:
				System.out.println("Saindo");
			default:
				System.out.println("Digite novamente");
				break;
			}

		} while (op != 6);

		sc.close();
	}
}

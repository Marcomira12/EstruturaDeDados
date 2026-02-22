package ex2;

import java.util.Scanner;

public class TesteArvore {
	public static void main(String[] args) {
		ArvoreBinaria arvore=new ArvoreBinaria();
		Scanner sc= new Scanner(System.in);
		int op;
		do {
			System.out.println("1 - inserir");
			System.out.println("2 - buscar");
			System.out.println("3 - listar");
			System.out.println("4 - Sair");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("Inserir numero");
				int num=sc.nextInt();
				arvore.inserirElemento(num);
				System.out.println("Inserido com sucesso");
				break;
			case 2:
				System.out.println("digite numero para busca");
				int busca=sc.nextInt();
				arvore.buscar(busca);
				break;
			case 3:
				System.out.println("Mostrando");
				arvore.mostrarPreOrdem();
				break;
			case 4:
				System.out.println("Saindo");
				break;
			
			default:
				System.out.println("Digite novamente");
				break;
			}

		} while (op != 4);
		sc.close();
	}
}

package Ex2;

import java.util.Scanner;

public class TesteEx2 {
	public static void main(String[] args) {
		Controle contro=new Controle();
		
		Scanner sc= new Scanner(System.in);
		String nome;
		String fabri;
		int opcao;
		do {
			System.out.println("========= MENU =========");
			System.out.println("1 - Inserir Nome do veiculo, fabricante (Caso seja toyota digite T)");
			System.out.println("2 - mostrar fila");
			System.out.println("3 - mostrar pilha");
			System.out.println("4 - Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Insira o nome e fabricante");
				nome=sc.nextLine();
				fabri=sc.nextLine();
				
				contro.inserir(nome, fabri);
				System.out.println("Inserido");
				break;

			
			case 2,3:
				
				contro.mostrar(opcao);
				
				break;

			
			case 4:
				System.out.println("Saindo");
				break;
			default:
				System.out.println("Opcao inválida! Tente novamente.");
			}
			

		} while (opcao != 4);
		
		
		
		
		
		sc.close();
	}
}

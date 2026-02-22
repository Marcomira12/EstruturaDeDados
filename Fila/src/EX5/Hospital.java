package EX5;

import java.util.Scanner;

import Lista_Fila.Fila;

public class Hospital {
	public static void main(String[] args) {
		Fila fila = new Fila();
		Scanner sc = new Scanner(System.in);
		int op;

		do {
			System.out.println("Inserir Paciente - 1");
			System.out.println("Atender paciente - 2");
			System.out.println("Verificar se há paciente- 3");
			System.out.println("Indicar o próximo paciente a ser atendido -4 ");
			System.out.println("Quantidade de pacientes - 5");
			System.out.println("Sair - 6");

			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("Inserir musica");
				String paciente = sc.nextLine();
				fila.inserirFila(paciente);
				break;
			case 2:
				System.out.println("Atender paciente");
				fila.proximoFila();
				break;
			case 3:
				System.out.println("Verificar se há paciente ");
				if (fila.isEmpety()) {
					System.out.println("Não há pacientes");
				} else {
					System.out.println("Há pacientes");
				}

				break;
			case 4:
				System.out.println("Indicar o próximo paciente a ser atendido");
				fila.proximoFila();
				break;
			case 5:
				System.out.println("Quantidade de pacientes é "+ fila.quantidade());
				break;
			case 6:
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção invalida");
			}

		} while (op != 6);

		sc.close();
	}
}

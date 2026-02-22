package Ex4;

import java.util.Scanner;

public class TesteEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Arvore arvore = new Arvore();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int n = sc.nextInt();
            arvore.inserir(n);
        }

        arvore.separarParesImpares(pilha, fila);

        System.out.println("\nNÚMEROS PARES (PILHA):");
        pilha.mostrar();

        System.out.println("\nNÚMEROS ÍMPARES (FILA):");
        fila.mostrar();

        sc.close();
    }
	
}

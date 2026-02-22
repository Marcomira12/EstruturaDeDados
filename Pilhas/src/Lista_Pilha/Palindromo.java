package Lista_Pilha;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) throws PilhaVaziaException {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase para verificar se é palíndromo: ");
        String entrada = sc.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println(" É palíndromo!");
        } else {
            System.out.println(" Não é palíndromo.");
        }
	}
	public static boolean ehPalindromo(String frase) throws PilhaVaziaException {

		frase = frase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		PilhaEncadeada<Character> pilha = new PilhaEncadeada<>();

		for (int i = 0; i < frase.length(); i++) {
			pilha.push(frase.charAt(i));
		}

		String invertida = "";
		while (!pilha.isVazia()) {
			invertida += pilha.pop();
		}

		return frase.equals(invertida);
	}
}

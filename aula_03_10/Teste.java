package aula_03_10_duplamenteEncadeada;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		DuplamenteEncadeada lista= new DuplamenteEncadeada();
		Scanner sc= new Scanner (System.in);
		
		String s;
		char op, ch = 'e';
		String dado = null;
		do {
			System.out.println("[I] - INCLUIR, [C] - CONSULTAR, [R] - REMOVER, [F] - SAIR ");
			do {
				s=sc.nextLine();
				op = s.charAt(0);
				op = Character.toLowerCase(op);
			}while (op != 'i' && op !='c' && op != 'r' && op != 'f');
			if(op =='i' || op == 'r' || op == 'c') {
				do {
					System.out.println("Informe [E] - ESQUERDA OU [D] - DIREITA");
					s = sc.nextLine();
					ch = s.charAt(0);
					ch = Character.toLowerCase(ch);
				}while(ch !='e' && ch !='d');
			}
	
			switch (op) {
			case 'i':
				System.out.println("Dado: ");
				dado = sc.nextLine();
				
				if (!dado.equals("")) {
					if(ch == 'e') {
						lista.inserirListaEsquerda(dado);
					}else {
						lista.inserirListaDireita(dado);
					}
				}
				break;
			case 'r':
				if(ch == 'e') {
					dado = lista.removerListaEsquerda();
				}else {
					dado = lista.removerListaDireita();
				}
				if (dado != null) {
					System.out.println("Você removeu o nodo: " +  dado);
				}else {
					System.out.println("A sua lista está vazia");
				}
				break;
			
			case 'c':
				if (ch == 'e') { 
					dado = lista.consultarEsq();
				} else {
					dado = lista.consultarDir();
				}
				System.out.println("Os dados consultados foram: " + dado);
				break;
			}
			lista.listarListaImprimir();
		}while(op != 'f');
		
		
		
		
		sc.close();
	}

}

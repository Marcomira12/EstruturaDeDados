package exercicio3;

public class ListaEncadeada {
private Celula primeiro, ultimo, posicaoAtual;
	

	public void adicionar(Numeros valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		// como ta minha lista??

		if (primeiro == null && ultimo == null) {// pq pergunto isso?? ta vazia ou tem elemento?
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}

	}

	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			/*
			 * if (posicaoAtual.getProximo() != null) temProximo= true; else temProximo =
			 * false;
			 */
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	public void listarRegistro() {
		Celula atual = primeiro;
		while (atual != null) {
			System.out.println(atual.getValor());
			atual = atual.getProximo();
		}

	}
	
	public int posicaoNumber(int desejo) {
		int contador = 1;
		Celula posicaoAtual = primeiro;
		while (posicaoAtual != null) {
			if(posicaoAtual.getValor() != null && posicaoAtual.getValor().getNumber() == desejo) {
				return contador;
			}
			contador++;
			posicaoAtual = posicaoAtual.getProximo();
		}
		return 0;
	}

 	public int tamanho() {
		int contador = 0;
		Celula posicaoAtual = primeiro;
		while (posicaoAtual != null) {
			contador++;
			posicaoAtual = posicaoAtual.getProximo();
		}
		return contador;
	}

	

}


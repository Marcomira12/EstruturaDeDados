package questao3;

public class ListaEncadeada {
	private Celula primeiro, ultimo, posicaoAtual;

	public void adicionar(Musicas valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		if (primeiro == null && ultimo == null) {
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

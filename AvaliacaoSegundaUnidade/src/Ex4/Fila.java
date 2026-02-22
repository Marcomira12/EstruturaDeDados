package Ex4;

public class Fila {
	private Nodo inicio;
	private Nodo fim;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}

	public boolean isVazia() {
		return inicio == null;
	}

	public void inserir(int valor) {
		Nodo novo = new Nodo(valor);
		if (isVazia()) {
			inicio = fim = novo;
		} else {
			fim.prox = novo;
			fim = novo;
		}
	}

	public Integer remover() {
		if (isVazia()) {
			return null;
		}
		int v = inicio.valor;
		inicio = inicio.prox;
		if (inicio == null) {
			fim = null;
		}
		return v;
	}

	public void mostrar() {
		if (isVazia()) {
			System.out.println("Fila vazia");
			return;
		}

		Nodo aux = inicio;
		while (aux != null) {
			System.out.println(aux.valor);
			aux = aux.prox;
		}
	}
}

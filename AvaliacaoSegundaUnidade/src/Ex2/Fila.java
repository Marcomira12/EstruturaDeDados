package Ex2;

public class Fila<T> {
	private Nodo<T> inicio, fim;

	public Fila() {

		this.inicio = null;
		this.fim = null;
	}

	public boolean isEmpety() {
		return (this.fim == null && this.inicio == null);
	}

	public void inserirFila(T marca, T fabri) {
		Nodo<T> novo = new Nodo<T>(marca, fabri);
		if (this.isEmpety()) {
			this.fim = this.inicio = novo;
		} else {
			fim.setProximo(novo);
			fim = novo;
		}
	}

	public void mostrar() {
		Nodo<T> aux = this.inicio;
		if (this.isEmpety())
			System.out.println("Lista Vazia");

		while (aux != null) {
			System.out.println(aux.toString());
			aux = aux.getProximo();

		}
	}

}

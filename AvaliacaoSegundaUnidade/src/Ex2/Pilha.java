package Ex2;

public class Pilha<T> {
	private Nodo<T> topo;

	public Pilha() {

		this.topo = null;
	}

	public boolean isVazia() {
		return this.topo == null;
	}

	public void mostrar() {

		Nodo<T> atual = this.topo;

		while (atual != null) {
			System.out.println(atual.toString());

			atual = atual.getProximo();

		}

	}

	public void push(T marca, T fabri) {

		Nodo<T> novo = new Nodo<T>(marca, fabri);
		novo.setProximo(this.topo);

		this.topo = novo;

	}

}

package Lista_Pilha;

import java.util.Arrays;
import java.util.Iterator;

public class PilhaEncadeada<T> {
	private No<T> topo;

	public PilhaEncadeada() {
		this.topo = null;
	}

	public boolean isVazia() {
		return this.topo == null;
	}

	public int getQuantidade() {
		int qtde = 0;

		No<T> atual = this.topo;

		while (atual != null) {

			++qtde;

			atual = atual.getProximo();

		}
		return qtde;
	}

	public void push(T elemento) {

		No<T> novo = new No<T>(elemento);
		novo.setProximo(this.topo);
		
		this.topo = novo;

	}


	public Iterator<T> iterator() {
		int i = 0;

		@SuppressWarnings("unchecked")
		T[] vetor = (T[]) new Object[this.getQuantidade()];

		No<T> atual = this.topo;

		while (atual != null) {
			vetor[i++] = atual.getElemento();
			atual = atual.getProximo();
		}

		return Arrays.asList(vetor).iterator();
	}

	public int get(T elem) {

		int i = 0;
		No<T> atual = this.topo;

		while (atual != null) {

			if (atual.getElemento().equals(elem))

				return i;
			atual = atual.getProximo();

			i++;
		}

		throw new ElementoNaoExisteException("Elemento não existe");

	}

	public T getTopo() throws PilhaVaziaException {

		if (this.isVazia())

			throw new PilhaVaziaException("pilha vazia");

		return this.topo.getElemento();

	}

	public T pop() throws PilhaVaziaException {
		T elem;
		if (this.isVazia())
			throw new PilhaVaziaException("tarefa concluida");
			
		elem = this.topo.getElemento();
		this.topo = this.topo.getProximo();
		return elem;
	}

	public void clear() {
		this.topo = null;
	}

}

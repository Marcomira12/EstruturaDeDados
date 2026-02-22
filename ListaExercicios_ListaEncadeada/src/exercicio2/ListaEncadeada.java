package exercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaEncadeada {
	private Celula primeiro, ultimo, posicaoAtual;
	

	public void adicionar(Matricula valor) {
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

	// esse eh o nosso metodo para excluir contato
	public void remover() {
		if (primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);

		} else {
			primeiro = ultimo = null;
		}

	}

	public void listarRegistro() {
		Celula atual = primeiro;
		while (atual != null) {
			System.out.println(atual.getValor());
			atual = atual.getProximo();
		}

	}

	private Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());

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

	public void imprimirOrdenado() {
		List<Matricula> tmp = new ArrayList<>();
		for (Celula c = primeiro; c != null; c = c.getProximo())
			tmp.add((Matricula) c.getValor());

		tmp.sort(Comparator.comparing(Matricula::getName, String.CASE_INSENSITIVE_ORDER));

		for (Matricula m : tmp)
			System.out.println(m);
	}

	public Matricula pesquisaPorNome(String name) {
		Celula celula = primeiro;
		while (celula != null) {
			Matricula mat = (Matricula) celula.getValor();
			if (mat.getName() == name) {
				return mat;
			}
			celula = celula.getProximo();
		}
		return null;
	}

}

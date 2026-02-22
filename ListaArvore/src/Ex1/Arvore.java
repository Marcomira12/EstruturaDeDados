package Ex1;

public class Arvore<T extends Comparable<T>> {
	private No<T> raiz;

	public Arvore() {

		this.raiz = null;
	}

	public boolean isVazia() {
		if (raiz == null)
			return true;
		return false;
	}

	public void inserir(T valor) {
		No<T> aux = new No<T>(valor);
		if (isVazia()) {
			this.raiz=aux;
			System.out.println("Raiz inserida");
			return;
		}
		inserirLado(raiz, aux);

	}

	private void inserirLado(No<T> atual, No<T> novo) {
		if (novo.getValor().compareTo(atual.getValor()) < 0) {
			if (atual.getEsq() == null) {
				atual.setEsq(novo);
			} else {
				inserirLado(atual.getEsq(), novo);
			}
		} else {

			if (atual.getDir() == null) {
				atual.setDir(novo);
			} else {
				inserirLado(atual.getDir(), novo);
			}
		}
	}

	public No<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(T valor) {
		this.raiz = new No<>(valor);
	}

	public void caminhamentoCentral() {
		caminhamentoCentral(raiz);
		System.out.println();
	}

	private void caminhamentoCentral(No<T> atual) {
		if (atual != null) {
			caminhamentoCentral(atual.getEsq());
			System.out.print(atual.getValor() + " ");
			caminhamentoCentral(atual.getDir());
		}
	}

	public void caminhamentoPreDireita() {
		caminhamentoPreDireita(raiz);
		System.out.println();
	}

	private void caminhamentoPreDireita(No<T> atual) {
		if (atual != null) {
			System.out.print(atual.getValor() + " ");
			caminhamentoPreDireita(atual.getDir());
			caminhamentoPreDireita(atual.getEsq());
		}
	}

	public void caminhamentoPosEsquerda() {
		caminhamentoPosEsquerda(raiz);
		System.out.println();
	}

	private void caminhamentoPosEsquerda(No<T> atual) {
		if (atual != null) {
			caminhamentoPosEsquerda(atual.getEsq());
			caminhamentoPosEsquerda(atual.getDir());
			System.out.print(atual.getValor() + " ");
		}
	}

	public void mostrarFolhas() {
		mostrarFolhas(raiz);
		System.out.println();
	}

	private void mostrarFolhas(No<T> atual) {
		if (atual != null) {
			if (atual.getEsq() == null && atual.getDir() == null) {
				System.out.print(atual.getValor() + " ");
			}
			mostrarFolhas(atual.getEsq());
			mostrarFolhas(atual.getDir());
		}
	}

	public void mostrarRaizEFilhos() {
		if (isVazia()) {
			System.out.println("Árvore vazia!");
			return;
		}

		System.out.println("Raiz: " + raiz.getValor());

		if (raiz.getEsq() != null)
			System.out.println("Filho esquerdo: " + raiz.getEsq().getValor());
		else
			System.out.println("Filho esquerdo: (nenhum)");

		if (raiz.getDir() != null)
			System.out.println("Filho direito: " + raiz.getDir().getValor());
		else
			System.out.println("Filho direito: (nenhum)");
	}
}

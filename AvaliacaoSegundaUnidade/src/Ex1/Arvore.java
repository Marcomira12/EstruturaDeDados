package Ex1;

public class Arvore<T> {
	private Nodo raiz;
	private int quantidade;
	public Arvore() {
		
		this.raiz = null;
	}
	
	public Nodo getRaiz() {
		return raiz;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	private boolean condicaoImpar(int elemento) {
		if(elemento%2==0)
			return false;
		return true;
	}

	public void inserirElemento(int elemento) {
		Nodo aux=new Nodo(elemento);
		if(!condicaoImpar(aux.getElemento())) {
			System.out.println("Não devera inserir numero par");
			return;
		}
		if(getRaiz()==null) {
			setRaiz(aux);
			this.quantidade++;
			return;
		}
		inserir(raiz,aux);
		System.out.println("Elemento inserido!");
	
	}
	private void inserir(Nodo atual,Nodo novo){
		
		if(novo.getElemento()< atual.getElemento()) {
			if(atual.getEsq()==null) {
				atual.setEsq(novo);
				this.quantidade++;
			}else {
				inserir(atual.getEsq(),novo);
			}
			
		}else {
			if (atual.getDir() == null) {
				atual.setDir(novo);
				this.quantidade++;
			} else {
				inserir(atual.getDir(), novo);
			}
		}
		
	}
	public void mostrarPreOrdem() {
		if (raiz == null) {
			System.out.println("Árvore vazia!");
			return;
		}

		System.out.println("Raiz: " + raiz.getElemento());
		System.out.print("Pré-ordem: ");
		preOrdem(raiz);
		System.out.println();
	}

	private void preOrdem(Nodo atual) {
		if (atual != null) {
			System.out.print(atual.getElemento() + " ");
			preOrdem(atual.getEsq());
			preOrdem(atual.getDir());
		}
	}

	
	
	
}

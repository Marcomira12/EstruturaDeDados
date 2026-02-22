package questao3;

public class ListaSimples {
	private Celula primeiro, ultimo, atual;
	private int n;
	
	public void adicionar(Livros valor) {
		Celula celula = new Celula();
		celula.setValor(valor);

		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
		n++;
	}

	public void remover() {
		if(primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
		n--;
	}
	
	
	public int getN() {
		return n;
	}

	private Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());

	}
	public void listarRegistro() {
		Celula atual = primeiro;         
	    while (atual != null) {
	        System.out.println(atual.getValor());
	        atual = atual.getProximo();
	    }	
	    
	}
	

}

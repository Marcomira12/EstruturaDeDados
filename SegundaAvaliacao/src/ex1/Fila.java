package ex1;

public class Fila<T> {
	private No<T> inicio,fim;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}
	public boolean isVazia() {
		if(this.fim==null && this.inicio==null) {
			return true;
		}
		return false;
	}
	public void solicitarEmprestimo(T elemento) {
		No<T> aux = new No<T>(elemento);
		if(isVazia()) {
			this.inicio=this.fim=aux;
		}
		else {
			fim.setProximo(aux);
			this.fim=aux;
		}
		
	}
	
	public void emprestarLivro() {
		No<T> aux= this.inicio;
		T elemento;
		if(isVazia()) {
			System.out.println("Fila esta vazia");
			return;
		}
		elemento=this.inicio.getElemento();
		this.inicio=this.inicio.getProximo();
		System.out.println(elemento);
		
	}
	public void listarPedidosEmprestimo() {
		No<T> atual= this.inicio;
		if(isVazia()) {
			System.out.println("Fila vazia");
		}
		while(atual!=null) {
			System.out.println(atual.getElemento());
			atual=atual.getProximo();
		}
		
	}
	
	
}

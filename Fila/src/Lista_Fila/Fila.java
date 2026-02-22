package Lista_Fila;

public class Fila<T> {
	private No<T> inicio, fim;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}

	public boolean isEmpety() {
		return (this.fim == null && this.inicio == null);
	}

	public void inserirFila(T valor) {
		No<T> novo = new No<T>(valor);
		if (this.isEmpety()) {
			this.fim = this.inicio = novo;
		} else {
			fim.setProximo(novo);
			fim = novo;
		}
	}

	public T removerFila() {
		if (this.isEmpety()) {
			System.out.println("Fila vazia");
			return null;
		} else {
			T valor = inicio.getElemento();
			inicio = inicio.getProximo();
			if (inicio == null)
				fim = null;
			return valor;
		}

	}
	
	public void proximoFila() {
		No<T> aux= this.inicio;
		if(this.isEmpety())
			System.out.println("Lista Vazia");
					
		
		System.out.println(aux.getElemento());
		
	}
	
	public void mostrar() {
		No<T> aux= this.inicio;
		if(this.isEmpety())
			System.out.println("Lista Vazia");
					
		while(aux !=null) {
			System.out.println(aux.getElemento());
			aux=aux.getProximo();
			
		}
	}
	
	public int quantidade() {
		int i=0;
		No<T> aux = this.inicio;
		while (aux != null) {
			aux=aux.getProximo();
			i++;
		}
	
		return i;
	}
	
	public int buscar(T valor) {
		int i=0;
		No<T> aux = this.inicio;
		while (aux != null) {
			if(aux.getElemento().equals(valor))
				return i;
			aux=aux.getProximo();
			i++;
		}
		System.out.println("elemento não encontrado");
		return -1;
	}
}

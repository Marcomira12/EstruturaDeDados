package Ex3;


public class Fila {
	private Nodo inicio,fim;

	public Fila() {
		
		this.inicio = null;
		this.fim = null;
	}
	
	public boolean isEmpety() {
		return (this.fim == null && this.inicio == null);
	}

	public void inserirFila(String tarefa) {
		Nodo novo = new Nodo(tarefa);
		if (this.isEmpety()) {
			this.fim = this.inicio = novo;
		} else {
			fim.setProximo(novo);
			fim = novo;
		}
	}

	public void mostrar() {
		Nodo aux = this.inicio;
		if (this.isEmpety())
			System.out.println("Lista Vazia");
		System.out.println(aux.getTarefa());
		removerFila();
	}
	private String removerFila() {
		if (this.isEmpety()) {
			System.out.println("Fila vazia");
			return null;
		} else {
			String valor = inicio.getTarefa();
			inicio = inicio.getProximo();
			if (inicio == null)
				fim = null;
			return valor;
		}

	}
	
	
}

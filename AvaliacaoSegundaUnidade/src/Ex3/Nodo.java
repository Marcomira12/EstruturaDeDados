package Ex3;

public class Nodo {
	private String tarefa;
	private Nodo proximo;
	public Nodo(String tarefa) {
		super();
		this.tarefa = tarefa;
	}
	public String getTarefa() {
		return tarefa;
	}
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	public Nodo getProximo() {
		return proximo;
	}
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	
	
}

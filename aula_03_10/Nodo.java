package aula_03_10_duplamenteEncadeada;

public class Nodo {
	public Nodo anterior =null;
	public Nodo prximo=null;
	public String dado;
	
	
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	public Nodo getPrximo() {
		return prximo;
	}
	public void setPrximo(Nodo prximo) {
		this.prximo = prximo;
	}
	public String getDado() {
		return dado;
	}
	public void setDado(String dado) {
		this.dado = dado;
	}

	
	
}

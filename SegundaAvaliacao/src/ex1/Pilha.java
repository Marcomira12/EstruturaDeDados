package ex1;

public class Pilha<T> {
	private No<T> topo;

	public Pilha() {
		this.topo = null;
	}
	private boolean isVazia() {
		if(this.topo==null)
			return true;
		return false;
	}
	
	public void devolverLivro(T elemento) {
		No<T> aux= new No<T>(elemento);
		aux.setProximo(this.topo);
		this.topo=aux;
	}
	
	public void listarHistoricoDevolucoes() {
		No<T> atual=this.topo;
		if(isVazia()) {
			System.out.println("Historico vazio");
			return;
		}
		while(atual!=null) {
			System.out.println(atual.getElemento());
			atual=atual.getProximo();
		}
	}
}

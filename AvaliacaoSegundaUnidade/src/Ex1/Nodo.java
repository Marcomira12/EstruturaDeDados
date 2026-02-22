package Ex1;

public class Nodo<T> {
	private int elemento;
	private Nodo esq,dir;
	
	
	public Nodo(int elemento) {
		
		this.elemento = elemento;
		this.esq = null;
		this.dir = null;
	}
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	public Nodo<T> getEsq() {
		return esq;
	}
	public void setEsq(Nodo<T> esq) {
		this.esq = esq;
	}
	public Nodo<T> getDir() {
		return dir;
	}
	public void setDir(Nodo<T> dir) {
		this.dir = dir;
	}
	
	
}

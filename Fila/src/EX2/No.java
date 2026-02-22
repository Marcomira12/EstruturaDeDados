package EX2;

public class No<T> {
	private T elemento;
	private T elemento1;

	public T getElemento1() {
		return elemento1;
	}
	public void setElemento1(T elemento1) {
		this.elemento1 = elemento1;
	}
	private No<T> proximo;
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public No<T> getProximo() {
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	public No(T elemento, T elemento1) {
		this.elemento1=elemento1;
		this.elemento = elemento;
		this.proximo = null;
	}
}

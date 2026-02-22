package Ex2;

public class Nodo<T> {
	private T marca;
	private T fabri;
	private Nodo<T> proximo;
	public Nodo(T marca, T fabri) {
	
		this.marca = marca;
		this.fabri = fabri;
	}
	@Override
	public String toString() {
		return "Informacao [Nome do veiculo=" + marca + ", fabricante=" + fabri + "]";
	}
	public T getMarca() {
		return marca;
	}
	public void setMarca(T marca) {
		this.marca = marca;
	}
	public T getFabri() {
		return fabri;
	}
	public void setFabri(T fabri) {
		this.fabri = fabri;
	}
	public Nodo<T> getProximo() {
		return proximo;
	}
	public void setProximo(Nodo<T> proximo) {
		this.proximo = proximo;
	}
	
	
}

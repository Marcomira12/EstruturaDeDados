package questao3;

public class Livros {
	private String nome;

	public Livros(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + "]";
	}
	
	
}

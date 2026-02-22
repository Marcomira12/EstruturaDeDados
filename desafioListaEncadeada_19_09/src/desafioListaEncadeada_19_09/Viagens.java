package desafioListaEncadeada_19_09;

public class Viagens {
	private int id,duracao;
	private String nome, pais;
	
	public Viagens(int id,String nome, int duracao, String pais) {
		
		this.id = id;
		this.duracao = duracao;
		this.nome = nome;
		this.pais = pais;
	}
	
	public Viagens(int duracao, String pais) {
		
		this.duracao = duracao;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}

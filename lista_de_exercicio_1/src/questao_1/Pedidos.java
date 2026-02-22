package questao_1;

public class Pedidos implements IBiblioteca {
	private String titulo;
	private String editora;
	private int ano_publicacao;
	
	public Pedidos(String titulo, String editora, int ano_publicacao) {
		
		this.titulo = titulo;
		this.editora = editora;
		this.ano_publicacao = ano_publicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(int ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	@Override
	public boolean adiconar() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remover() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

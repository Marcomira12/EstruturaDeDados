package questao_16;

public class Anotacao implements IDiario{
	private double data;
	private String titulo;
	private String conteudo;
	
	public Anotacao(double data, String titulo, String conteudo) {
		this.data = data;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public boolean adicionar() {
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

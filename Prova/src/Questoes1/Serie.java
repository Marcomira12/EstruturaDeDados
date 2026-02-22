package Questoes1;

public class Serie implements IOperacao{
	private String nome;
	private double nota;
	
	
	
	public Serie() {
		super();
	}
	public Serie(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public void adicionar(String nome, double nota) {
		this.nome=nome;
		this.nota=nota;
		
	}
	@Override
	public void listarSerie() {
		Serie serie= new Serie();
		System.out.println(serie.getNome()+" "+serie.getNota());
		
	}
	@Override
	public void alterarSerie(String nome) {
		this.nome=nome;
		
	}
	@Override
	public boolean excluuir(String nome) {
		
		return true;
	}
	
}

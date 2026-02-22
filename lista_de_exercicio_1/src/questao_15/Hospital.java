package questao_15;

public class Hospital implements IFila {
	private String nome;
	private int prioridade;
	private double hora_chegada;
	
	
	public Hospital(String nome, int prioridade, double hora_chegada) {
		this.nome = nome;
		this.prioridade = prioridade;
		this.hora_chegada = hora_chegada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public double getHora_chegada() {
		return hora_chegada;
	}

	public void setHora_chegada(double hora_chegada) {
		this.hora_chegada = hora_chegada;
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

}

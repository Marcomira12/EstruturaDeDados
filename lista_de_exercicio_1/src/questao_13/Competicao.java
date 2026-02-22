package questao_13;

public class Competicao implements ICampeonato{
	
	public Competicao(String campeonato, int time_participantes, double pontuacao) {
		
		this.campeonato = campeonato;
		this.time_participantes = time_participantes;
		this.pontuacao = pontuacao;
	}
	public String getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}
	public int getTime_participantes() {
		return time_participantes;
	}
	public void setTime_participantes(int time_participantes) {
		this.time_participantes = time_participantes;
	}
	public double getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}
	private String campeonato;
	private int time_participantes;
	private double pontuacao;
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

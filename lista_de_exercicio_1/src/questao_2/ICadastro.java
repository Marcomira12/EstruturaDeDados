package questao_2;

public class ICadastro implements IEscola {
	private String nome;
	private int semestre;
	
	
	
	
	public ICadastro(String nome, int semestre) {
		
		this.nome = nome;
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
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

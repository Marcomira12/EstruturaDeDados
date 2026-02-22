package questao1;

public class DiciplinasCursadas implements IOperacao{
	private String nomeDisciplina;
	private String professor;
	private double media;
	
	
	public DiciplinasCursadas(String nomeDisciplina, String professor, double media) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.professor = professor;
		this.media = media;
	}
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
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
	public void listar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}
}

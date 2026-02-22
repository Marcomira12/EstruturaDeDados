package exercicio2;

public class Matricula {
	private int matricula;
	private String name;

	

	@Override
	public String toString() {
		return "Matricula [matricula=" + matricula + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Matricula(int matricula, String name) {
		super();
		this.matricula = matricula;
		this.name = name;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}

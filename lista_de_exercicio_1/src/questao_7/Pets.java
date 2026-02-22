package questao_7;

public class Pets implements IOperacao {

	private String nome;
	private int number;
	private String data;
	private String raca;

	public Pets(String nome, int number, String data, String raca) {
		this.nome = nome;
		this.number = number;
		this.data = data;
		this.raca = raca;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public boolean getNome(String nome) {
		if (this.nome == null) {
			System.out.println("Não é possivel adicionar");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean getNumberTutor(int number) {
		if (this.number <= 0) {
			System.out.println("Não é possivel adicionar");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean getRaca(String raca) {
		if (this.raca == null) {
			System.out.println("Não é possivel adicionar");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean getData(String data) {
		if (this.data == null || data == "00/00/00") {
			System.out.println("Não é possivel adicionar");
			return false;
		} else {
			return true;
		}
	}

}

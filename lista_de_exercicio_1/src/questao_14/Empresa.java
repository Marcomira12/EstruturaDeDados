package questao_14;

public class Empresa implements IContratacao{
	private String nome_funcionario;
	private String cargo;
	private double salario;
	private double data_admissao;
	
	
	public Empresa(String nome_funcionario, String cargo, double salario, double data_admissao) {
		
		this.nome_funcionario = nome_funcionario;
		this.cargo = cargo;
		this.salario = salario;
		this.data_admissao = data_admissao;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(double data_admissao) {
		this.data_admissao = data_admissao;
	}

	@Override
	public boolean adicionar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar() {
		// TODO Auto-generated method stub
		return false;
	}

}

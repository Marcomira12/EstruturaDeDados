package pratica_sala_TAD;

public class Cliente implements Icontato{
	private String nome;
	private int idade;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cliente(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public boolean Adiconar() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean Remover() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean Alterar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

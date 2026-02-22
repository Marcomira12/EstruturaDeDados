package questao_3;

public class IProfessores implements IControle {
	private int codigo_diciplina;
	private String nome;
	
	
	
	
	public IProfessores(int codigo_diciplina, String nome) {
		
		this.codigo_diciplina = codigo_diciplina;
		this.nome = nome;
	}
	public int getCodigo_diciplina() {
		return codigo_diciplina;
	}
	public void setCodigo_diciplina(int codigo_diciplina) {
		this.codigo_diciplina = codigo_diciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public boolean adicionar(int codigo_diciplina,String nome ) {
		
		return false;
	}
	@Override
	public boolean remover(int codigo_diciplina,String nome) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean alterar(int codigo_diciplina,String nome) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

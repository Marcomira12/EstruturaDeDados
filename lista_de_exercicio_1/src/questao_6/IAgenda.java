package questao_6;

public class IAgenda implements IOperacao {

	private int numero_telefone;

	
	public IAgenda(int numero_telefone) {
		
		this.numero_telefone = numero_telefone;
	}

	public int getNumero_telefone() {
		return numero_telefone;
	}

	public void setNumero_telefone(int numero_telefone) {
		this.numero_telefone = numero_telefone;
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
	public boolean excluir() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean atualizar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

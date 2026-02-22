package questao_4;

public class ICalculadora implements IOperacao {
	private int numero_1;
	private int numeor_2;
	
	public int getNumero_1() {
		return numero_1;
	}
	public void setNumero_1(int numero_1) {
		this.numero_1 = numero_1;
	}
	public int getNumeor_2() {
		return numeor_2;
	}
	public void setNumeor_2(int numeor_2) {
		this.numeor_2 = numeor_2;
	}
	public ICalculadora(int numero_1, int numeor_2) {
		
		this.numero_1 = numero_1;
		this.numeor_2 = numeor_2;
	}
	@Override
	public boolean igualdade_dois_numeros(int numero_1,int numero_2) {
		if(numero_1==numero_2) {
			System.out.println("São iguais ");
			return true;
		}
		return false;
	}
	@Override
	public int somar(int numero_1,int  numero_2) {
		int soma;
		soma=numero_1+numero_2;
		return soma;
	}
	@Override
	public int multiplicar(int numero_1,int  numero_2) {
		int multiplicar;
		multiplicar= numero_1*numero_2;
		return multiplicar;
	}
	@Override
	public int criar_racional(int numero_1,int  numero_2) {
		int racional;
		racional=numero_1/ numero_2;
		return racional;
	}
	
	
	
	
}

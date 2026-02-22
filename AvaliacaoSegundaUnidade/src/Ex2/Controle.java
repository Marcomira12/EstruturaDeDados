package Ex2;


public class Controle {
	Fila fila=new Fila();
	Pilha pilha=new Pilha();
	
	
	public void inserir(String nomeVeiculo,String fabri ) {
		
		if("T".equalsIgnoreCase(fabri)) {
			pilha.push(nomeVeiculo, fabri);
		}
		else {
			fila.inserirFila(nomeVeiculo, fabri);
		}
		
		
	}
	public void mostrar(int opcao) {
		if(opcao==2) {
			fila.mostrar();
		}else {
			pilha.mostrar();
		}
	}
}

package desafio_12_09_professor;

public class ListaEncadeda {

	public static void main(String[] args) {
		ListaEncadeda ListaEncadeada= new ListaEncadeda();
		Controle controle= new Controle();
		ListaEncadeada.addContato(controle);
		System.out.println("Todos os contatos foram adicionados com sucesso!!");
		System.out.println("Você tem os seguintes contatos adicionados: ");
		while(controle.temProximo()) {
			System.out.println(controle.getPosicaoAtual().getValor().getMatricula()+"  "+controle.getPosicaoAtual().getValor().getNome());
		}
		System.out.println("Agora vamos remover!!");
		
		ListaEncadeada.removerContato(controle);
		System.out.println("Contatos removidos");
		System.out.println("A lista ficou assim: ");
		while(controle.temProximo()) {
			System.out.println(controle.getPosicaoAtual().getValor().getNome());
		}
		

	}
	public void addContato(Controle controle) {
	    Professor contato1 = new Professor("Martina",20000); //valor1
	    Professor contato2 = new Professor("VitorInacio", 30000); //valor2
	    Professor contato3 = new Professor("Pedro", 40000); //valor3
	    Professor contato4 = new Professor("Lima", 40000); //valor3
    
	 
	    controle.adicionar(contato1); 
	    controle.adicionar(contato2); 
	    controle.adicionar(contato3); 
	    controle.adicionar(contato4); 
	    
	}
	
	public void removerContato(Controle listaEncadeada) {
		listaEncadeada.remover();

		
	}
}

package desafioListaEncadeada_19_09;

public class ExecucaoListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada listaEncadeada= new ListaEncadeada();
		ExecucaoListaEncadeada execucaoListaEncadeada= new ExecucaoListaEncadeada();
		execucaoListaEncadeada.addContato(listaEncadeada);
		
		
		System.out.println("Todos os contatos foram adicionados com sucesso!!");
		System.out.println("Você tem os seguintes contatos adicionados: ");
		
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getPais()+" "+listaEncadeada.getPosicaoAtual().getValor().getDuracao()+" Dias");
		}
		/*
		System.out.println("Agora vamos remover!!");
		
		execucaoListaEncadeada.removerContato(listaEncadeada);
		System.out.println("Contatos removidos");
		System.out.println("A lista ficou assim: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}*/
		
		

	}
	public void addContato(ListaEncadeada listaEncadeada) {
	    Viagens contato1 = new Viagens(100,"Marco",5,"Portugal"); //valor1
	    Viagens contato2 = new Viagens(200,"Joao",4,"Irlanda"); //valor2
	    Viagens contato3 = new Viagens(300,"Maria",3,"Japao"); //valor3
	    Viagens contato4 = new Viagens(400,"Caio",2,"Brasil"); //valor3
    
	 
	    listaEncadeada.adicionar(contato1); 
	    listaEncadeada.adicionar(contato2); 
	    listaEncadeada.adicionar(contato3); 
	    listaEncadeada.adicionar(contato4); 
	    
	}
	public void removerContato(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();

		
	}
}

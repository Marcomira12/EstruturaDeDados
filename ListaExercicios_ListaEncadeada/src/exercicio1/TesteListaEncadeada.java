package exercicio1;


public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista= new ListaEncadeada();
		TesteListaEncadeada execucao= new TesteListaEncadeada();
		
	      System.out.println("Lista vazia? " + execucao.vazio(lista)); // true
	        execucao.addContato(lista);

	        lista.listarRegistro();
	        System.out.println("Tamanho: " + execucao.tamanho(lista));   // 3
	        
	        System.out.println("Lista vazia? " + execucao.vazio(lista));
	        
	        execucao.removerContato(lista); 
	        
	        System.out.println("Registros");
	        
	        execucao.todosRegistros(lista); 
	        System.out.println("Tamanho: " + execucao.tamanho(lista));
	        execucao.removerRegistros(lista); 
	        lista.listarRegistro(); 
	        
	        System.out.println("Lista vazia? " + execucao.vazio(lista));

	}
	
	public void addContato(ListaEncadeada lista) {
		Professores contato1= new Professores("Jamile");
		Professores contato2= new Professores("Angela");
		Professores contato3= new Professores("Bomfim");
		
		lista.adicionar(contato1);
		lista.adicionar(contato2);
		lista.adicionar(contato3);
	}
	public void removerContato(ListaEncadeada lista) {
		lista.remover();
	}
	public int tamanho(ListaEncadeada lista) {
		
		return lista.tamanho();
	}
	
	public void removerRegistros(ListaEncadeada lista) {
		lista.removerTodoRegistro();
	}
	public void todosRegistros(ListaEncadeada lista) {
		lista.listarRegistro();
	}
	public boolean vazio(ListaEncadeada lista) {
		return lista.verificarVazia();
	}

}

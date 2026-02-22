package exercicio2;



public class TesteLista {

	public static void main(String[] args) {
		TesteLista teste= new TesteLista();
		ListaEncadeada lista= new ListaEncadeada();
		teste.addContato(lista);
		teste.listaOrdemAlfa(lista);
		
		System.out.println(teste.pesquisa("Bomfim", lista));

	}
	public void addContato(ListaEncadeada lista) {
		Matricula contato1= new Matricula(100,"Jamile");
		Matricula contato2= new Matricula(120,"Angela");
		Matricula contato3= new Matricula(200,"Bomfim");
		
		lista.adicionar(contato1);
		lista.adicionar(contato2);
		lista.adicionar(contato3);
	}
	public void removerContato(ListaEncadeada lista) {
		lista.remover();
	}
	public void todosRegistros(ListaEncadeada lista) {
		lista.listarRegistro();
	}
	public void listaOrdemAlfa(ListaEncadeada lista) {
		lista.imprimirOrdenado();;
	}
	public Matricula pesquisa(String name,ListaEncadeada lista) {
		return lista.pesquisaPorNome(name);
	}

}

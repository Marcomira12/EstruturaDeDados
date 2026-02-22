package questao3;

public class TesteLista {

	public static void main(String[] args) {
		ListaSimples lista=new ListaSimples();
		TesteLista teste= new TesteLista();
		teste.addLivros(lista);
		System.out.println("Livros adicionados");
		teste.listar(lista);
		System.out.println("Tamanho");
		System.out.println(teste.tamanho(lista));
		
		teste.removerLivros(lista);
		System.out.println(" Removido");
		teste.listar(lista);
		System.out.println("Tamanho");
		System.out.println(teste.tamanho(lista));
	        

	}
	public void addLivros(ListaSimples lista) {
		Livros lv1=new Livros("Torto Arado");
		Livros lv2= new Livros("Salvar Fogo");
		Livros lv3= new Livros("Pequeno Principe");
		
		lista.adicionar(lv1);
		lista.adicionar(lv2);
		lista.adicionar(lv3);
	}
	public void removerLivros(ListaSimples lista) {
		lista.remover();
	}
	public void listar(ListaSimples lista) {
		lista.listarRegistro();
	}
	public int tamanho(ListaSimples lista) {
		return lista.getN();
	}
}

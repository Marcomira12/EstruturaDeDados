package questao3;

public class TesteLista {

	public static void main(String[] args) {
		ListaEncadeada lista= new ListaEncadeada();
		TesteLista teste = new TesteLista();
		teste.adicionarMusicas(lista);
		System.out.println("Todos os registros");
		teste.listarRegistro(lista);
		System.out.println("Tamanho: "+teste.tamanho(lista));
		
	}
	public void adicionarMusicas(ListaEncadeada lista) {
		Musicas musica1= new Musicas("Malandrinha");
		Musicas musica2= new Musicas("Andar com fé");
		Musicas musica3= new Musicas("Dengo");
		
		lista.adicionar(musica1);
		lista.adicionar(musica2);
		lista.adicionar(musica3);
		
	}
	public void listarRegistro(ListaEncadeada lista) {
		lista.listarRegistro();
	}
	public int tamanho(ListaEncadeada lista) {
		return lista.tamanho();
		
	}
}

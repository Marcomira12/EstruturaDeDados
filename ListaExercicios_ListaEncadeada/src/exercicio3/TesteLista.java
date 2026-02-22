package exercicio3;

public class TesteLista {

	public static void main(String[] args) {
		ListaEncadeada lista= new ListaEncadeada();
		TesteLista teste= new TesteLista();
		teste.addContato(lista);
		System.out.println(teste.posicao(5, lista));

	}
	public void addContato(ListaEncadeada lista) {
		Numeros contato1= new Numeros(1);
		Numeros contato2= new Numeros(4);
		Numeros contato3= new Numeros(3);
		Numeros contato4= new Numeros(5);
		Numeros contato5= new Numeros(7);
		Numeros contato6= new Numeros(9);
		
		lista.adicionar(contato1);
		lista.adicionar(contato2);
		lista.adicionar(contato3);
		lista.adicionar(contato4);
		lista.adicionar(contato5);
		lista.adicionar(contato6);
	}
	public int posicao(int numero,ListaEncadeada lista) {
		return lista.posicaoNumber(numero);
	}
	

}

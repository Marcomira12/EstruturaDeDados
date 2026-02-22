package questao_1;

public class ListaDuplamente extends Nodo{
	private Nodo primeiro=null;
	private Nodo ultimo=null; //para determinar o primeiro e o ultimo, criando assim na classe dois destinos para o obejto Nodo
	private int n;//tamanho
	public ListaDuplamente() {
		int num;
		Nodo proximo;
		Nodo anterior;
	}
	
	public void inserirEsquerda(int n) {
		Nodo aux= new Nodo();
		aux.setNum(n);
		if(n==0) {
			primeiro=aux;
			ultimo= aux;
		}else {
			aux.proximo = primeiro;
            primeiro.anterior = aux;
            primeiro = aux;
		}
		this.n++;
			
	}
	public void inserirListaDireita(int valor) {
        Nodo aux = new Nodo();
        aux.setNum(valor);
        if (n == 0) { // lista vazia
            primeiro = aux;
            ultimo = aux;
        } else {
            ultimo.proximo = aux;
            aux.anterior = ultimo;
            ultimo = aux;
        }
        n++;
    }
	
	
}

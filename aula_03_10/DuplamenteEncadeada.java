package aula_03_10_duplamenteEncadeada;

public class DuplamenteEncadeada {
	private Nodo primeiro = null;
    private Nodo ultimo = null;
    private int n;


    private static class Nodo {
        String professor;
        Nodo anterior;
        Nodo proximo;
    }
    
    
    public void inserirListaEsquerda(String valor) {
        Nodo aux = new Nodo();
        aux.professor = valor;
        if (n == 0) {
            primeiro = aux;
            ultimo = aux;
            
        } else {
            aux.proximo = primeiro;
            primeiro.anterior = aux;
            primeiro = aux;
        }
        n++;
    }

   
    public void inserirListaDireita(String valor) {
        Nodo aux = new Nodo();
        aux.professor = valor;
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

    // Remover da esquerda
    public String removerListaEsquerda() {
        if (n == 0) {
            return null; 
        }
        String dado = primeiro.professor;
        n--;
        if (n == 0) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.proximo;
            primeiro.anterior = null;
        }
        return dado;
    }

    // Remover da direita
    public String removerListaDireita() {
        if (n == 0) {
            return null; // lista vazia
        }
        String dado = ultimo.professor;
        n--;
        if (n == 0) {
            primeiro = null;
            ultimo = null;
        } else {
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }
        return dado;
    }

    // Consultar da esquerda
    public String consultarEsq() {
        if (primeiro != null) {
            return primeiro.professor;
        } else {
            return null; // lista vazia
        }
    }

    // Consultar da direita
    public String consultarDir() {
        if (ultimo != null) {
            return ultimo.professor;
        } else {
            return null; // lista vazia
        }
    }

    // Listar elementos da lista
    public void listarListaImprimir() {
        Nodo aux = primeiro;
        System.out.println("Listando elementos da lista duplamente encadeada:");
        if (aux != null) {
            while (aux != null) {
                System.out.print(aux.professor + " ");
                aux = aux.proximo;
            }
        } else {
            System.out.println("Você está tentando imprimir uma lista vazia :(");
        }
        System.out.println();
    }
   
}

package Ex4;

public class Pilha {
    private Nodo topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean isVazia() {
        return topo == null;
    }

    public void push(int valor) {
        Nodo novo = new Nodo(valor);
        novo.prox = topo;
        topo = novo;
    }

    public Integer pop() {
        if (isVazia()) {
            return null;
        }
        int v = topo.valor;
        topo = topo.prox;
        return v;
    }

    public void mostrar() {
        if (isVazia()) {
            System.out.println("Pilha vazia");
            return;
        }

        Nodo aux = topo;
        while (aux != null) {
            System.out.println(aux.valor);
            aux = aux.prox;
        }
    }
}

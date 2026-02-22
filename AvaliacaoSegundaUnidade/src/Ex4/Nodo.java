package Ex4;

public class Nodo {
    int valor;

    Nodo esq;
    Nodo dir;

    Nodo prox;

    public Nodo(int valor) {
        this.valor = valor;
        this.esq = null;
        this.dir = null;
        this.prox = null;
    }
}

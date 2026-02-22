package Ex4;

public class Arvore {
    private Nodo raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Nodo inserirRec(Nodo atual, int valor) {
        if (atual == null) {
            return new Nodo(valor);
        }

        if (valor < atual.valor) {
            atual.esq = inserirRec(atual.esq, valor);
        } else {
            atual.dir = inserirRec(atual.dir, valor);
        }

        return atual;
    }

    public void separarParesImpares(Pilha pilha, Fila fila) {
        percorrerEmOrdem(raiz, pilha, fila);
    }

    private void percorrerEmOrdem(Nodo no, Pilha pilha, Fila fila) {
        if (no == null) return;

        percorrerEmOrdem(no.esq, pilha, fila);

        if (no.valor % 2 == 0) {
            pilha.push(no.valor);   
        } else {
            fila.inserir(no.valor); 
        }

        percorrerEmOrdem(no.dir, pilha, fila);
    }
}

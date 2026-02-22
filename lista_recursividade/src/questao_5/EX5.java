package questao_5;

public class EX5 {

	public static void main(String[] args) {
		imprimeCrescente(5);

	}
	public static void imprimeCrescente(int n) {
        if (n <= 0) return;
        imprimeCrescente(n - 1);
        System.out.print(n + " ");
    }
}

package questao_6;

public class EX6 {

	public static void main(String[] args) {
		contagemRegressiva(5); 

	}
	public static void contagemRegressiva(int n) {
	        if (n < 0) return;
	        System.out.print(n + " ");
	        contagemRegressiva(n - 1);
	    }
}

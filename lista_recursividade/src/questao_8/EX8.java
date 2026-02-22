package questao_8;

public class EX8 {

	public static void main(String[] args) {
		  System.out.println(somaNaturais(10));

	}
	 public static int somaNaturais(int n) {
	        if (n <= 0) return 0;
	        return n + somaNaturais(n - 1);
	    }
}

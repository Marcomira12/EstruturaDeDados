package questao_2;

public class fatorial {

	public static void main(String[] args) {
	
		System.out.println(fato(3));

	}
	public static int fato(int n) {
		if(n==1) {
			return 1;
		}
		
		return n*fato(n-1);
	}
}

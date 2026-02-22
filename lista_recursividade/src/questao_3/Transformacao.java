package questao_3;

public class Transformacao {

	public static void main(String[] args) {
	System.out.println(binario(13));

	}
	public static int binario(int n) {
		if(n==0) {
			return 0;
		}
		
		return (n % 2) + 10 * binario(n / 2);
	}
}

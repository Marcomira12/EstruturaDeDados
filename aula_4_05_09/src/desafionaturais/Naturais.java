package desafionaturais;

public class Naturais {

	public static void main(String[] args) {
		/*int n=0;
		naturais(n);*/
		for(int i=1;i<=100;i++) {
			System.out.println(naturais(i));
			
		}

	}
	public static int naturais(int n) {
		
		if(n==1) {
			
			return 1;
		}else {
			

			return naturais(n-1)+1;
			
				
		}
		
		
	}
}

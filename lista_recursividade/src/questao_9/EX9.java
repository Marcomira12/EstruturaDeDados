package questao_9;

public class EX9 {

	public static void main(String[] args) {
		System.out.println(potencia(3, 5));

	}
	public static int potencia(int base, int expoente) {
        if (expoente == 0) return 1;
        if (expoente == 1) return base;
        return multiplica(base, potencia(base, expoente - 1));
    }

    private static int multiplica(int a, int b) {
        if (b == 0) return 0;
        return a + multiplica(a, b - 1);
    }
}

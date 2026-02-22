package questao_12;

public class EX12 {

	public static void main(String[] args) {
		int[] v = {1, 2, 3, 4};
        System.out.println(somaArray(v, 0));

	}
	public static int somaArray(int[] v, int i) {
        if (i == v.length) return 0;
        return v[i] + somaArray(v, i + 1);
    }
}

package questao_14;

public class EX14 {

	public static void main(String[] args) {
		int[] v = {7, 2, 9, 4};
        System.out.println(maxArray(v, 0));

	}
	public static int maxArray(int[] v, int i) {
        if (i == v.length - 1) return v[i];
        int maxRestante = maxArray(v, i + 1);
        return (v[i] > maxRestante) ? v[i] : maxRestante;
    }
}

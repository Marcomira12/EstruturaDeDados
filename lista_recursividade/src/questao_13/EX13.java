package questao_13;

public class EX13 {

	public static void main(String[] args) {
		System.out.println(contaChar("banana", 'a', 0));

	}
	public static int contaChar(String s, char c, int i) {
        if (i == s.length()) return 0;
        int add = (s.charAt(i) == c) ? 1 : 0;
        return add + contaChar(s, c, i + 1);
    }
}

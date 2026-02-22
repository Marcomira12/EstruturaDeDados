package questao_7;

public class EX7 {

	public static void main(String[] args) {
		System.out.println(ehPalindromo("A sacada da casa")); 
        System.out.println(ehPalindromo("Java")); 
	}
	public static boolean ehPalindromo(String s) {
        String limpo = s.replaceAll("\\s+", "").toLowerCase();
        return pal(limpo, 0, limpo.length() - 1);
    }

    private static boolean pal(String s, int i, int j) {
        if (i >= j) return true;
        return s.charAt(i) == s.charAt(j) && pal(s, i + 1, j - 1);
    }

}

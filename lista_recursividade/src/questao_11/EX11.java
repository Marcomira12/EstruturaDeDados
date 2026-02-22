package questao_11;

public class EX11 {

	public static void main(String[] args) {
		System.out.println(inverte("recursao"));

	}
	public static String inverte(String s) {
        if (s.length() <= 1) return s;
        return inverte(s.substring(1)) + s.charAt(0);
    }
}

public class Utilitaria {
    private static int qtdVogais;
    private static int qtdDigitos;

    public static int vogais(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                || str.charAt(i) == 'u') {
                qtdVogais++;
            }
        }
        return qtdVogais;
    }

    public static int digitos(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) qtdDigitos++;
        }
        return qtdDigitos;
    }

    public static boolean ehPalindromo(String str) {
        String aux = "";
        for (int i = str.length() -1; i >= 0; i--) {
            aux += str.charAt(i);
        }
        return aux.equalsIgnoreCase(str);
    }
}

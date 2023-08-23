/*
    1-) Faça um programa que a partir de uma String digitada pelo usuário imprima:

    a)O número de caracteres da string.
    b) A string com todas suas letras em maiúsculo.
    c) O número de vogais da string.  (Criar uma classe utilitária e um método pra isso.)
    d) Se a string digitada começa com "INF" (ignorando maiúsculas/minúsculas).
    e) Se a string digitada termina com "NET" (ignorando maiúsculas/minúsculas).
    f) O número de dígitos (0 a 9) da string. (Utilizar a classe utilitaria e criar um método para isso)
    g) Os 2 primeiros digitos da String.
    h) Se a string é um palíndromo ou não. (Utilizar a classe utilitaria e criar um método para isso)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;

        System.out.print("Digite uma palavra ou frase: ");
        string = sc.nextLine();

        System.out.printf("Item a: %s tem %d caracteres\n", string, string.length());
        System.out.printf("Item b: %s em maiúsculo: %s\n", string, string.toUpperCase());
        System.out.printf("Item c: %s tem %d vogais\n", string, Utilitaria.vogais(string.toLowerCase()));
        if (string.toUpperCase().startsWith("INF"))
            System.out.printf("Item d: %s começa com INF\n", string);
        else
            System.out.printf("Item d: %s não começa com INF\n", string);
        if (string.toUpperCase().endsWith("NET"))
            System.out.printf("Item e: %s termina com NET\n", string);
        else
            System.out.printf("Item e: %s não termina com NET\n", string);
        System.out.printf("Item f: %s tem %d dígitos\n", string, Utilitaria.digitos(string));
        System.out.printf("Item g: Os 2 primeiros dígitos: %s\n", string.substring(0, 2));
        if (Utilitaria.ehPalindromo(string)) System.out.printf("Item h: %s é palíndromo\n", string);
        else System.out.printf("Item h: %s não é palíndromo\n", string);
    }
}

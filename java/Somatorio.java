package java;
import java.util.Arrays;

public class Somatorio {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20};
        System.out.println("Soma de " + Arrays.toString(numeros) + ": " + somatorio(numeros));
    }

    public static int somatorio(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }
}

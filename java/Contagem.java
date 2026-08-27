package java;


public class Contagem {
    public static void main(String[] args) {
        int[] dados = {5, 12, 3, 8, 15, 10, 2};
        int N = 10;
        System.out.println("Quantidade de elementos entre " + dados[0] + " e " + N + ": " + contagem(dados, N));
    }

    public static int contagem(int[] dados, int n) {
        if (dados == null || dados.length == 0) return 0;
        int primeiro = dados[0];
        int min = Math.min(primeiro, n);
        int max = Math.max(primeiro, n);
        int contador = 0;
        for (int valor : dados) {
            if (valor >= min && valor <= max) contador++;
        }
        return contador;
    }
}

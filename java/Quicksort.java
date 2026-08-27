package java;
import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62};
        System.out.println("Antes: " + Arrays.toString(array));
        quicksort(array, 0, array.length - 1);
        System.out.println("Depois: " + Arrays.toString(array));
    }

    public static void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(array, inicio, fim);
            quicksort(array, inicio, pivo - 1);
            quicksort(array, pivo + 1, fim);
        }
    }

    private static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = (inicio - 1);
        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        return i + 1;
    }
}

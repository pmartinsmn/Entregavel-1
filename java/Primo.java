package java;
public class Primo {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(n + " e primo? " + isPrimo(n));
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

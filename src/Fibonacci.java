public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.print("Primeiros " + n + " termos de Fibonacci: ");
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        if (n <= 0) return;
        int a = 0, b = 1;
        System.out.print(a);
        if (n > 1) {
            System.out.print(", " + b);
            for (int i = 2; i < n; i++) {
                int proximo = a + b;
                System.out.print(", " + proximo);
                a = b;
                b = proximo;
            }
        }
        System.out.println();
    }
}

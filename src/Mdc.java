public class Mdc {
    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("MDC de " + a + " e " + b + " e: " + mdc(a, b));
    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}

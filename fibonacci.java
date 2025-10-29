public class fibonacci{

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int anterior = 0, actual = 1, siguiente = 0;

        for (int i = 2; i <= n; i++) {
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }

        return actual;
    }

    public static void main(String[] args) {
        int n = 7;
        int resultado = fibonacci(n);
        System.out.println("El elemento " + n + " de Fibonacci es " + resultado);
    }
}

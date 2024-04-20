import java.util.stream.IntStream;

public class SumaNaturales {
    public static void main(String[] args) {
        int n = 5;
        int resultado = sumaNaturales(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
    }

    public static int sumaNaturales(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }
}


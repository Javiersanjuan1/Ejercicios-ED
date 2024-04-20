import java.util.Scanner;

public class ImprimirNaturalesEntre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número (d): ");
        int d = scanner.nextInt();

        System.out.println("Los números naturales entre " + a + " y " + d + " son:");
        imprimirNaturalesEntre(a, d);

        scanner.close();
    }

    public static void imprimirNaturalesEntre(int a, int d) {
        if (a <= d) {
            System.out.print(a + " ");
            imprimirNaturalesEntre(a + 1, d);
        }
    }
}

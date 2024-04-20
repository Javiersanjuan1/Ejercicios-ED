public class PotenciaRecursiva {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int resultado = potencia(x, y);
        System.out.println(x + " elevado a " + y + " es igual a: " + resultado);
    }

    public static int potencia(int x, int y) {
        // Caso base: si y es 0, el resultado es 1
        if (y == 0) {
            return 1;
        }
        // Caso recursivo: x elevado a y es igual a x multiplicado por x^(y-1)
        return x * potencia(x, y - 1);
    }
}

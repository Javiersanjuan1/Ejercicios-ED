public class CantidadDigitos {

    public static void main(String[] args) {
        int numero = 12345;
        int cantidad = contarDigitos(numero);
        System.out.println("El número de dígitos de " + numero + " es: " + cantidad);
    }

    public static int contarDigitos(int numero) {
        // Caso base: cuando el número tiene un solo dígito
        if (numero < 10) {
            return 1;
        }
        // Caso recursivo: contar el dígito actual y llamar recursivamente con el resto del número
        return 1 + contarDigitos(numero / 10);
    }
}

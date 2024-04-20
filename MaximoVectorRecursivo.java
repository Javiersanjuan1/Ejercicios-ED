public class MaximoVectorRecursivo {

    public static void main(String[] args) {
        int[] vector = {3, 7, 2, 8, 5};
        int maximo = encontrarMaximo(vector, 0);
        System.out.println("El valor máximo del vector es: " + maximo);
    }

    public static int encontrarMaximo(int[] vector, int indice) {
        if (indice == vector.length - 1) {
            return vector[indice];
        }
        int maximoRestante = encontrarMaximo(vector, indice + 1);
        return Math.max(vector[indice], maximoRestante);
    }
}

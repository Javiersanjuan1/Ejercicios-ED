public class MaximoVectorRecursivo {

    public static void main(String[] args) {
        int[] vector = {3, 7, 2, 8, 5};
        int maximo = encontrarMaximo(vector, 0);
        System.out.println("El valor máximo del vector es: " + maximo);
    }

    public static int encontrarMaximo(int[] vector, int indice) {
        // Caso base: si el índice alcanza el final del vector, se devuelve el mínimo valor posible
        if (indice == vector.length - 1) {
            return vector[indice];
        }
        // Llamada recursiva para encontrar el máximo entre el valor actual y el máximo del resto del vector
        int maximoRestante = encontrarMaximo(vector, indice + 1);
        return Math.max(vector[indice], maximoRestante);
    }
}

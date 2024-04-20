import java.util.Arrays;

public class QuickSortOptimizado {

    public static void main(String[] args) {
        int[] arreglo = {12, 4, 5, 6, 7, 3, 1, 15, 10, 9, 8, 14, 13, 2, 11};
        quickSort(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }

    public static void quickSort(int[] arreglo) {
        quickSort(arreglo, 0, arreglo.length - 1);
    }

    private static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int[] particion = particionar(arreglo, inicio, fin);
            quickSort(arreglo, inicio, particion[0] - 1);
            quickSort(arreglo, particion[1] + 1, fin);
        }
    }

    private static int[] particionar(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[inicio];
        int lt = inicio;
        int gt = fin;
        int i = inicio + 1;

        while (i <= gt) {
            if (arreglo[i] < pivote) {
                intercambiar(arreglo, lt++, i++);
            } else if (arreglo[i] > pivote) {
                intercambiar(arreglo, i, gt--);
            } else {
                i++;
            }
        }
        return new int[]{lt, gt};
    }

    private static void intercambiar(int[] arreglo, int i, int j) {
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }
}


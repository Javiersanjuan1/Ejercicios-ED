public class CoeficienteBinomial {

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int coeficiente = calcularCoeficienteBinomial(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + coeficiente);
    }

    public static int calcularCoeficienteBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calcularCoeficienteBinomial(n - 1, k) + calcularCoeficienteBinomial(n - 1, k - 1);
        }
    }
}


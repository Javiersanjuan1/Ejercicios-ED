public class HexadecimalToDecimal {

    public static void main(String[] args) {
        String hex = "1A";
        int decimal = hexadecimalToDecimal(hex);
        System.out.println("El valor decimal de " + hex + " es: " + decimal);
    }

    public static int hexadecimalToDecimal(String hex) {
        return hexadecimalToDecimalRecursive(hex, hex.length() - 1, 0);
    }

    private static int hexadecimalToDecimalRecursive(String hex, int index, int result) {
        if (index < 0) {
            return result;
        }
        char digit = hex.charAt(index);
        int value = Character.isDigit(digit) ? digit - '0' : Character.toUpperCase(digit) - 'A' + 10;
        return hexadecimalToDecimalRecursive(hex, index - 1, result + value * (int) Math.pow(16, hex.length() - 1 - index));
    }
}


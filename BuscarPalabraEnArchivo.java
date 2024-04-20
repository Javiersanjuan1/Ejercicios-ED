import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscarPalabraEnArchivo {

    public static void main(String[] args) {
        String archivo = "texto.txt";
        String palabra = "ejemplo";
        buscarPalabraEnArchivo(archivo, palabra);
    }

    public static void buscarPalabraEnArchivo(String archivo, String palabra) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            String linea;
            int numeroLinea = 1;
            boolean encontrada = false;
            while ((linea = lector.readLine()) != null) {
                if (linea.contains(palabra)) {
                    encontrada = true;
                    System.out.println("La palabra \"" + palabra + "\" fue encontrada en la línea " + numeroLinea + ":");
                    System.out.println(linea);
                }
                numeroLinea++;
            }

            if (!encontrada) {
                System.out.println("La palabra \"" + palabra + "\" no fue encontrada en el archivo.");
            }
            lector.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

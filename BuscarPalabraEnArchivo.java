import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscarPalabraEnArchivo {

    public static void main(String[] args) {
        // Ruta del archivo y palabra a buscar
        String archivo = "texto.txt";
        String palabra = "ejemplo";

        // Realizar la búsqueda de la palabra en el archivo
        buscarPalabraEnArchivo(archivo, palabra);
    }

    public static void buscarPalabraEnArchivo(String archivo, String palabra) {
        try {
            // Crear un lector para el archivo
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            String linea;
            int numeroLinea = 1;
            boolean encontrada = false;

            // Leer cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                // Buscar la palabra en la línea actual
                if (linea.contains(palabra)) {
                    encontrada = true;
                    System.out.println("La palabra \"" + palabra + "\" fue encontrada en la línea " + numeroLinea + ":");
                    System.out.println(linea);
                }
                numeroLinea++;
            }

            // Si la palabra no se encontró en ninguna línea
            if (!encontrada) {
                System.out.println("La palabra \"" + palabra + "\" no fue encontrada en el archivo.");
            }

            // Cerrar el lector
            lector.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

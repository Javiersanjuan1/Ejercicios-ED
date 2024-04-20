import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusquedaBinariaPalabraEnArchivo {

    public static void main(String[] args) {
        // Ruta del archivo y palabra a buscar
        String archivo = "texto.txt";
        String palabra = "ejemplo";

        // Realizar la búsqueda de la palabra en el archivo
        buscarPalabraEnArchivoConBusquedaBinaria(archivo, palabra);
    }

    public static void buscarPalabraEnArchivoConBusquedaBinaria(String archivo, String palabra) {
        try {
            // Lista para almacenar todas las líneas del archivo
            List<String> lineas = new ArrayList<>();

            // Leer todas las líneas del archivo
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }
            lector.close();

            // Ordenar las líneas alfabéticamente
            Collections.sort(lineas);

            // Realizar la búsqueda binaria
            int indicePalabra = Collections.binarySearch(lineas, palabra);

            // Si la palabra fue encontrada, imprimir la línea
            if (indicePalabra >= 0) {
                System.out.println("La palabra \"" + palabra + "\" fue encontrada en la línea " + (indicePalabra + 1) + ":");
                System.out.println(lineas.get(indicePalabra));
            } else {
                // Si la palabra no fue encontrada, imprimir un mensaje indicando que no fue encontrada
                System.out.println("La palabra \"" + palabra + "\" no fue encontrada en el archivo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

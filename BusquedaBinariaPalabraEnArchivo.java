import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusquedaBinariaPalabraEnArchivo {

    public static void main(String[] args) {
        String archivo = "texto.txt";
        String palabra = "ejemplo";
        buscarPalabraEnArchivoConBusquedaBinaria(archivo, palabra);
    }

    public static void buscarPalabraEnArchivoConBusquedaBinaria(String archivo, String palabra) {
        try {
            List<String> lineas = new ArrayList<>();
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }
            lector.close();
            Collections.sort(lineas);
            int indicePalabra = Collections.binarySearch(lineas, palabra);
            if (indicePalabra >= 0) {
                System.out.println("La palabra \"" + palabra + "\" fue encontrada en la línea " + (indicePalabra + 1) + ":");
                System.out.println(lineas.get(indicePalabra));
            } else {
                System.out.println("La palabra \"" + palabra + "\" no fue encontrada en el archivo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

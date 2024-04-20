import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLineasArchivo {

    public static void main(String[] args) {
        // Rutas de los archivos de entrada y salida
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida_ordenada.txt";

        // Ordenar las líneas del archivo
        ordenarLineasArchivo(archivoEntrada, archivoSalida);

        System.out.println("Las líneas del archivo han sido ordenadas y guardadas en " + archivoSalida);
    }

    public static void ordenarLineasArchivo(String archivoEntrada, String archivoSalida) {
        try {
            // Lista para almacenar las líneas del archivo
            List<String> lineas = new ArrayList<>();

            // Leer las líneas del archivo de entrada
            BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
            reader.close();

            // Ordenar las líneas alfabéticamente
            Collections.sort(lineas);

            // Escribir las líneas ordenadas en el archivo de salida
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida));
            for (String lineaOrdenada : lineas) {
                writer.write(lineaOrdenada);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

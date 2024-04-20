import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLineasArchivo {

    public static void main(String[] args) {
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida_ordenada.txt";

        ordenarLineasArchivo(archivoEntrada, archivoSalida);

        System.out.println("Las líneas del archivo han sido ordenadas y guardadas en " + archivoSalida);
    }

    public static void ordenarLineasArchivo(String archivoEntrada, String archivoSalida) {
        try {
            List<String> lineas = new ArrayList<>();

            BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
            reader.close();
            Collections.sort(lineas);

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

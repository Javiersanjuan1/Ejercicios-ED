import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarFechas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de fechas
        System.out.print("Introduce el número de fechas: ");
        int numeroFechas = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del entero

        List<LocalDate> fechas = new ArrayList<>();

        // Solicitar al usuario ingresar las fechas
        for (int i = 0; i < numeroFechas; i++) {
            System.out.print("Introduce la fecha " + (i + 1) + " en formato (YYYY-MM-DD): ");
            String fechaString = scanner.nextLine();
            LocalDate fecha = LocalDate.parse(fechaString);
            fechas.add(fecha);
        }

        // Ordenar las fechas cronológicamente
        Collections.sort(fechas);

        // Imprimir las fechas ordenadas
        System.out.println("Fechas ordenadas cronológicamente:");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha);
        }

        scanner.close();
    }
}

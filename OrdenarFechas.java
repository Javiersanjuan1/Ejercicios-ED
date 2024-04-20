import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarFechas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de fechas: ");
        int numeroFechas = scanner.nextInt();
        scanner.nextLine();

        List<LocalDate> fechas = new ArrayList<>();
        for (int i = 0; i < numeroFechas; i++) {
            System.out.print("Introduce la fecha " + (i + 1) + " en formato (YYYY-MM-DD): ");
            String fechaString = scanner.nextLine();
            LocalDate fecha = LocalDate.parse(fechaString);
            fechas.add(fecha);
        }
        Collections.sort(fechas);
        System.out.println("Fechas ordenadas cronológicamente:");
        for (LocalDate fecha : fechas) {
            System.out.println(fecha);
        }

        scanner.close();
    }
}

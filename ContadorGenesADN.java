import java.util.Random;

public class ContadorGenesADN {

    public static void main(String[] args) {
        // Generar cadena de ADN aleatoria
        String cadenaADN = generarCadenaADNAleatoria(1000); // Longitud de la cadena de ADN: 1000

        // Contar el número de genes
        int numeroGenes = contarGenes(cadenaADN);

        System.out.println("La cadena de ADN tiene " + numeroGenes + " genes.");
    }

    public static String generarCadenaADNAleatoria(int longitud) {
        String bases = "ACGT";
        StringBuilder cadena = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(bases.length());
            cadena.append(bases.charAt(indice));
        }
        return cadena.toString();
    }

    public static int contarGenes(String cadenaADN) {
        int contador = 0;
        int indiceInicio = 0;

        while (indiceInicio != -1) {
            indiceInicio = cadenaADN.indexOf("ATG", indiceInicio); // Buscar el próximo "ATG"
            if (indiceInicio != -1) {
                contador++;
                indiceInicio += 3; // Mover el índice después de "ATG"
            }
        }

        return contador;
    }
}

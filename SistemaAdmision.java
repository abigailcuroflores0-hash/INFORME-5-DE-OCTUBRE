import java.util.Scanner;

public class SistemaAdmision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la nota de Matemática: ");
        double matematica = entrada.nextDouble();

        System.out.print("Ingrese la nota de Comunicación: ");
        double comunicacion = entrada.nextDouble();

        if (matematica >= 11 && comunicacion >= 11) {
            System.out.println("Postulante Admitido.");
        }
    }
}
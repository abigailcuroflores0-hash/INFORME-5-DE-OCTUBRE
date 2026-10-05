import java.util.Scanner;

public class AlumnoDestacado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una nota: ");
        double nota = entrada.nextDouble();

        if (nota >= 17) {
            System.out.println("Es un Alumno destacado.");
        }
    }
}
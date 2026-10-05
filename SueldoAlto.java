import java.util.Scanner;

public class SueldoAlto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el sueldo: ");
        double sueldo = entrada.nextDouble();

        if (sueldo > 3500) {
            System.out.println("Pertenece al grupo de sueldos altos.");
        }
    }
}
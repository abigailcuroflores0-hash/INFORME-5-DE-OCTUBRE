import java.util.Scanner;

public class DescuentoporCompra {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double compra = entrada.nextDouble();

        if (compra >= 300) {
            System.out.println("Aplica descuento del 10%.");
        }

        entrada.close();
    }
}
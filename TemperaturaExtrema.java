import java.util.Scanner;

public class TemperaturaExtrema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la temperatura: ");
        double temperatura = entrada.nextDouble();

        if (temperatura > 35) {
            System.out.println("Es una Temperatura extrema.");
        }
    }
}
import java.util.Scanner;

public class CuartoProyecto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valor1, valor2;
        int opcion = 1;

        while (opcion != 0) {
            System.out.println("Ingrese el primer valor a evaluar: ");
            valor1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo valor a evaluar: ");
            valor2 = entrada.nextDouble();

            if(valor1 > valor2) {
                System.out.println("El número mayor es " + valor1);
            } else if (valor1 == valor2) {
                System.out.println("Ambos números son iguales");
            } else {
                System.out.println("El numero mayor es " + valor2);
            }

            System.out.println("***********************¿Desea evaluar a otros valores?***********************");
            System.out.println("Pulse cualquier número para continuar o pulse '0' para salir de la aplicación");
            opcion = entrada.nextInt();
        }

        System.out.println("Gracias por su preferencia.");
    }
}

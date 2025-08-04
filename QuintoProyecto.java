import java.util.Scanner;

public class QuintoProyecto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double precio;
        int opcion = 1;

        while (opcion != 0) {
            System.out.println("Ingrese el precio del artículo: ");
            precio = entrada.nextDouble();

            if(precio >= 100) {
                precio = precio * 0.9;
                System.out.println("""
                        ¡¡¡Descuento Aplicado!!!
                        El total de la compra es: """ + precio);
            } else {
                System.out.println("""
                        ¡¡¡Descuento No Aplicado!!!
                        El total de la compra es: """ + precio);
            }

            System.out.println("*************************¿Desea evaluar a otra venta?************************");
            System.out.println("Pulse cualquier número para continuar o pulse '0' para salir de la aplicación");
            opcion = entrada.nextInt();
        }
    }
}

import java.util.Scanner;

public class PrimerPyoyecto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;
        int opcion = 1;

        while(opcion != 0) {
            System.out.print("Introduce el numero: ");
            numero = input.nextInt();

            if(numero%2==0){
                System.out.println("El número " + numero + "es par");
            } else{
                System.out.println("El número " + numero + " es impar");
            }

            System.out.println("******************¿Desea ingresar otro número para evaluar?******************");
            System.out.println("Pulse cualquier número para continuar o pulse '0' para salir de la aplicación");
            opcion = input.nextInt();

        }
    }
}

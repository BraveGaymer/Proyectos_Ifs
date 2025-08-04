import java.util.Scanner;

public class SegundoProyecto {

    public static void main(String[] args) {

        double promedio;
        int opcion = 1;

        Scanner entrada = new Scanner(System.in);

        while(opcion != 0) {

            while (true) {
                System.out.println("Ingrese el promedio del estudiante: ");
                promedio = entrada.nextDouble();

                if(promedio > 10) {
                    System.out.println("El promedio no puede ser mayor a 10. Intente de nuevo.");
                } else {
                    break;
                }
            }

            if(promedio >= 7) {
                System.out.println("El estudiante tuvo un promedio de " + promedio + " y fue aprobado");
            } else if (promedio >= 5) {
                System.out.println("El estudiante tuvo un promedio de " + promedio + " y está en recuperación");
            } else {
                System.out.println("El estudiante tuvo un promedio de " + promedio + " y fue reprobado");
            }

            System.out.println("**********************¿Desea evaluar a otro estudiante?**********************");
            System.out.println("Pulse cualquier número para continuar o pulse '0' para salir de la aplicación");
            opcion = entrada.nextInt();
        }

        System.out.println("Gracias por su preferencia.");
    }
}

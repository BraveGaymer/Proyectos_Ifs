import java.util.Scanner;

public class TercerProyecto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String contrasena = "SoulMate01";
        String entradaContrasena;

        while(true){
            System.out.println("Ingrese la contraseña: ");
            entradaContrasena = entrada.nextLine();

            if (!contrasena.equals(entradaContrasena)) {
                System.out.println("La contraseña es incorrecta. Intentelo de nuevo");
            } else {
                System.out.println("La contraseña es correcta!!!");
                break;
            }
        }
    }
}

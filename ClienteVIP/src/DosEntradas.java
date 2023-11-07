import java.util.Scanner;

public class DosEntradas {
    public static void main(String[] args) {
        App Tremendo=new App();
        Scanner lector=new Scanner(System.in);

        System.out.println("Bienvenido a 2 Parametros Cliente VIP");
        System.out.println("Por favor ingrese su nombre: ");
        String nombre = lector.nextLine();
        Tremendo.setNombre(nombre);

        System.out.println("Por favor ingrese su correo electrónico: ");
        String email = lector.nextLine();
        Tremendo.setEmail(email);

        Tremendo.setSaldoLimite(100000);

        System.out.println("O///////////////////////////////////////O");

        System.out.println("Usuario: "+Tremendo.getNombre());
        System.out.println("Correo electrónico: "+Tremendo.getEmail());

        System.out.println("Su saldo limite es de: "+Tremendo.getSaldoLimite());
        lector.close();
    }
}

import java.util.Scanner;

public class Parametros {
    
    public static void main(String[] args) {

        App Tremendo=new App();
        Scanner lector=new Scanner(System.in);

        ///////////////////////////////////////////

        System.out.println("Primer usuario VIP");
        System.out.println("");

        Tremendo.setNombre("Jaretzy Natalia Mena Gutierrez");
        Tremendo.setEmail("TremendoZoyVIP@gmail.com");
        Tremendo.setSaldoLimite(100000);
        System.out.println("Usuario: "+Tremendo.getNombre());
        System.out.println("Correo electrónico: "+Tremendo.getEmail());
        System.out.println("Su saldo limite es de: "+Tremendo.getSaldoLimite());

        ///////////////////////////////////////////

        App AEIOU=new App();

        System.out.println("");

        System.out.println("O///////////////////////////////////////O");
        System.out.println("");

        System.out.println("Segundo usuario VIP");
        System.out.println("");

        System.out.println("Por favor ingrese el nombre: ");
        String nombre = lector.nextLine();
        AEIOU.setNombre(nombre);

        System.out.println("Por favor ingrese el correo electrónico: ");
        String email = lector.nextLine();
        AEIOU.setEmail(email);

        AEIOU.setSaldoLimite(100000);

        System.out.println("*-------------------------------------------*");

        System.out.println("Usuario: "+AEIOU.getNombre());
        System.out.println("Correo electrónico: "+AEIOU.getEmail());

        System.out.println("Su saldo limite es de: "+AEIOU.getSaldoLimite());
        
        ///////////////////////////////////////////

        System.out.println("");

        App PAN =new App();

        System.out.println("O///////////////////////////////////////O");

        System.out.println("");

        System.out.println("Último usuario VIP");

        System.out.println("");

        System.out.println("Por favor ingrese el nombre: ");
        String nombre2 = lector.nextLine();
        PAN.setNombre(nombre2);

        System.out.println("Por favor ingrese el correo electrónico: ");
        String email2 = lector.nextLine();
        PAN.setEmail(email2);

        System.out.println("Por favor ingrese el saldo límite");
        double saldolimited=lector.nextDouble();
        PAN.setSaldoLimite(saldolimited);
        
        System.out.println("Usuario: "+PAN.getNombre());
        System.out.println("Correo electrónico: "+PAN.getEmail());
        System.out.println("Su saldo limite es de: "+PAN.getSaldoLimite());

        lector.close();

    }

}

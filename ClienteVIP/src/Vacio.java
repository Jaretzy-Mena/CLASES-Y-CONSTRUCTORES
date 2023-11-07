public class Vacio {
    public static void main(String[] args) throws Exception{
        App Tremendo= new App();

        System.out.println("Bienvenido al Vacio Cliente VIP");
        Tremendo.setNombre("Jaretzy Natalia Mena Gutierrez");
        Tremendo.setEmail("TremendoZoyVIP@gmail.com");
        Tremendo.setSaldoLimite(100000);
        System.out.println("Usuario: "+Tremendo.getNombre());
        System.out.println("Correo electrónico: "+Tremendo.getEmail());
        System.out.println("Su saldo limite es de: "+Tremendo.getSaldoLimite());

    }
}

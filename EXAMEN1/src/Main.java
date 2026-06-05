public class Main {

    public static void main(String[] args) {
        ServicioSuscripcion ServS = new ServicioSuscripcion("Spotify", 200, 3);
        ServicioEmpresarial ServE = new ServicioEmpresarial("Teams", 500, 20);
        Streaming Strea = new Streaming("Netflix", 180, 6, 2, true);
        Musica Music = new Musica("Spotify Premium", 220, 6, "premium");
        Cloud Cloud = new Cloud("Google Cloud", 2000, 100, 1000, "corporativo");

        System.out.println("======================================================");
        System.out.println("RESUMEN");
        System.out.println("======================================================");
        System.out.println("El costo total del Servicio Suscripcion es: $" + ServS.calcularCosto());
        System.out.println("El costo total del Servicio Empresarial es: $" + ServE.calcularCosto());
        System.out.println("El costo total del Servicio Streaming es: $" + Strea.calcularCosto());
        System.out.println("El costo total del Servicio Musica es: $" + Music.calcularCosto());
        System.out.println("El costo total del Servicio Cloud es: $" + Cloud.calcularCosto());
        System.out.println("======================================================");
    }
}
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Rectangulo(5, 3);
        Figura figura2 = new Triangulo(6, 4, 5, 5, 6);
        Figura figura3 = new Circulo(4);

        System.out.println("RECTANGULO");
        System.out.println("Area: " + figura1.calcularArea());
        System.out.println("Perimetro: " + figura1.calcularPerimetro());

        System.out.println("\nTRIANGULO");
        System.out.println("Area: " + figura2.calcularArea());
        System.out.println("Perimetro: " + figura2.calcularPerimetro());

        System.out.println("\nCIRCULO");
        System.out.println("Area: " + figura3.calcularArea());
        System.out.println("Perimetro: " + figura3.calcularPerimetro());
    }
}

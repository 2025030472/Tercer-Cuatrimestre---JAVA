import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
        Auto auto1 = new Auto("Mazda", "Altima", 13000, 4);
        Moto moto1 = new Moto("Mortalika", "Danger", 18000, 4);

        System.out.printf("El costo del carro es: $" + auto1.calcularCosto() + "\n");
        System.out.printf("El costo de la moto es: $" + moto1.calcularCosto() + "\n");
    }
}

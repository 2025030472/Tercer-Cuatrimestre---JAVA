import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos seres vivos quieres registrar?");
        int cantidad = teclado.nextInt();
        teclado.nextLine();
        SerVivo[] seresVivos = new SerVivo[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\n--- Registro " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Tipo (Planta o Animal): ");
            String tipo = teclado.nextLine();

            if (tipo.equalsIgnoreCase("Planta")) {
                seresVivos[i] = new Planta(nombre, edad);
            } else if (tipo.equalsIgnoreCase("Animal")) {
                seresVivos[i] = new Animal(nombre, edad);
            } else {
                System.out.println("Tipo no valido. Se registrara como Animal.");
                seresVivos[i] = new Animal(nombre, edad);
            }
        }

        System.out.println("\n=================================");
        System.out.println("SERES VIVOS REGISTRADOS");
        System.out.println("=================================");

        for (SerVivo ser : seresVivos) {
            ser.mostrarInformacion();
            System.out.print("Tipo: ");
            if (ser instanceof Planta) {
                System.out.println("Planta");
            } else {
                System.out.println("Animal");
            }
            System.out.println("------------------------");
        }

        System.out.println("\n=================================");
        System.out.println("ACCIONES DE LOS SERES VIVOS");
        System.out.println("=================================");

        for (SerVivo ser : seresVivos) {
            ser.realizarAccion();
        }
        teclado.close();
    }
}
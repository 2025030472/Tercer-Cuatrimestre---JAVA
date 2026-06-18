import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas personas desea registrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Persona[] personas = new Persona[n];

        int hombres = 0;
        int mujeres = 0;
        int menores = 0;
        int adultos = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nRegistro persona " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.print("Genero (Hombre/Mujer): ");
            String genero = sc.nextLine();

            personas[i] = new Persona(nombre, edad, genero);

            // Contadores genero
            if (genero.equalsIgnoreCase("Hombre")) {
                hombres++;
            } else if (genero.equalsIgnoreCase("Mujer")) {
                mujeres++;
            }

            // Contadores edad
            if (edad <= 18) {
                menores++;
            } else {
                adultos++;
            }
        }

        System.out.println("\n===== LISTA DE PERSONAS REGISTRADAS =====");

        for (int i = 0; i < n; i++) {
            personas[i].mostrarDatos();
        }

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Total hombres: " + hombres);
        System.out.println("Total mujeres: " + mujeres);
        System.out.println("Total menores: " + menores);
        System.out.println("Total adultos: " + adultos);

        sc.close();
    }
}
public class Main {

    public static void main(String[] args) {

        Cuenta c1 = new Cuenta();

        c1.titular = "Juan";
        c1.saldo = 5000;

        // ERROR GRAVE
        c1.saldo = -10000;

        System.out.println("Saldo: " + c1.saldo);
    }
}
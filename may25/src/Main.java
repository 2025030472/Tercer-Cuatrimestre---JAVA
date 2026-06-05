public class Main {
    public static void main(String[] args) {
        EmpleadoVendedor empleado1 = new EmpleadoVendedor ("Carlos", 5000, 2000);
        EmpleadoRepartidor empleado2 = new EmpleadoRepartidor ("Ana", 4000, 10);

        System.out.println("Salario Vendedor: " + empleado1.calcularSalario());
        System.out.println("Salario Repartidor: " + empleado2.calcularSalario());
    }
}

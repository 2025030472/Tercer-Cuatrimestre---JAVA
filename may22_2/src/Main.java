// Main.java
public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Juan", 5000);

        c1.depositar(2000);
        c1.retirar(1000);

        // ESTO YA NO ES POSIBLE:
        // c1.saldo = -10000;

        System.out.println("Saldo final: " + c1.getSaldo());
    }
}

/*
class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre nombre;
        this.salarioBase = salarioBase;
    }
    public double calcularSalario(){
        return salarioBase;
    }
}

class EmpleadoVendedor extends Empleado {
    private  double comision;

    public EmpleadoVendedor(String nombre, double salarioBase, double comision){
        super(nombre, salarioBase);
        this.comision = comision;
    }
}

class EmpleadoRepartidor extends Empleado{
    private init zonasRepartidas;

    public EmpleadoRepartidor (String nombre, double salarioBase, int zonasRepartidas){
        super(nombre, salarioBase);
        this.zonasRepartidas = zonasRepartidas;
    }
}

 */
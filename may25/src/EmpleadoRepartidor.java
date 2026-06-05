public class EmpleadoRepartidor extends Empleado{
    private  double zonasRepartidas;

    public EmpleadoRepartidor(String nombre, double salarioBase, double zonasRepartidas){
        super(nombre, salarioBase);
        this.zonasRepartidas = zonasRepartidas;
    }

    public double calcularSalario(){
        return this.salarioBase + (this.zonasRepartidas * 50);
    }
}
public class Servicio {
    protected String nombre;
    protected double costoBase;

    public Servicio(String nombre, double costoBase){
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public double calcularCosto(){
        return costoBase;
    }
}

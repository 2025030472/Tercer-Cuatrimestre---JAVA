public class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, double costoBase, int numPuertas){
        super(marca, modelo, costoBase);
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularCosto(){
        return costoBase + (numPuertas * 100);
    }

}

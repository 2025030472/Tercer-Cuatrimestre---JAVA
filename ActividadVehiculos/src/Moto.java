public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, double costoBase, int cilindrada){
        super(marca, modelo, costoBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCosto(){
        return costoBase + (cilindrada * 10);
    }
}

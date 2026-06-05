public class Streaming extends ServicioSuscripcion{
    private int pantallas;
    private boolean premiumExtra;

    public Streaming(String nombre, double costoBase, int meses, int pantallas, boolean premiumExtra){
        super(nombre, costoBase, meses);
        this.premiumExtra = premiumExtra;
    }

    @Override
    public double calcularCosto(){
        double costo = super.calcularCosto();
        costo += pantallas * 50;
        if (premiumExtra){
            costo += 100;
        }
        return costo;
    }
}
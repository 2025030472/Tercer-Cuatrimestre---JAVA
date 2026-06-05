public class Musica extends ServicioSuscripcion{
    private String calidad;

    public Musica(String nombre, double costoBase, int meses, String calidad){
        super(nombre, costoBase, meses);
        this.calidad = calidad;
    }

    @Override
    public double calcularCosto(){
        double costo = super.calcularCosto();
        switch(calidad) {
            case "baja":
                costo += 100;
                break;
            case "media":
                costo += 200;
                break;
            case "alta":
                costo += 300;
                break;
            case "premium":
                costo += 400;
                break;
            default:
                System.out.println("INCHE CODIGO TRONO");
        }
        return costo;
    }
}
public class Bateria extends Instrumento{
    public Bateria(String nombre, double precio){
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("La " + getNombre() + "Suena: BOOM CHAK! Ritmo pesado. (Precio: $" + getPrecio() + ")");
    }
}
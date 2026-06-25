public class Guitarra extends Instrumento {
    public Guitarra(String nombre, double precio){
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("");
        System.out.println("La " + getNombre() + "Suena: Rasgueo de cuerdas... Ding Dang! (Precio: $" + getPrecio() + ")");
    }
}
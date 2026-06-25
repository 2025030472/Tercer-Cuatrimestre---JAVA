abstract class Instrumento {
    private String nombre;
    private double precio;

    public Instrumento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // METODO ABSTRACTO; No tiene cuerpo { }, Termine en punto y coma.
    // Obliga a las clases hijas a definir su propio sonido.
    public abstract void tocar();

    // GETER Y SETTERS (Encapsulamiento)
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
}

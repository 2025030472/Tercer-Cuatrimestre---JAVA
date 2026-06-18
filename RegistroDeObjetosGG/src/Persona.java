public class Persona {

    String nombre;
    int edad;
    String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre +
                " | Edad: " + edad +
                " | Genero: " + genero);
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
}
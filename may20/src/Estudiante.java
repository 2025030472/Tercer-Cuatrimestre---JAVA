public class Estudiante {

    // ==========================
    // Atributos
    // ==========================
    private String nombre;
    private double calificacion;

    // ==========================
    // Constructor
    // ==========================
    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        setCalificacion(calificacion);
    }

    // ==========================
    // Getters
    // ==========================
    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // ==========================
    // Setter
    // ==========================
    public void setCalificacion(double nuevaCalificacion) {

        if (nuevaCalificacion >= 0 && nuevaCalificacion <= 10) {
            this.calificacion = nuevaCalificacion;
        } else {
            System.out.println("Error: la calificacion debe estar entre 0 y 10.");
        }
    }

    // ==========================
    // Métodos
    // ==========================
    public boolean haAprobado() {
        return calificacion >= 6.0;
    }

    public void mostrarInfo() {

        System.out.println("Alumno: " + nombre);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("Estado: " + (haAprobado() ? "Aprobado" : "Reprobado"));
        System.out.println("--------------------------------");
    }
}
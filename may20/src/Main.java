public class Main {

    public static void main(String[] args) {

        // Crear objetos de la clase Estudiante
        Estudiante alumno1 = new Estudiante("Carlos", 7.5);
        Estudiante alumno2 = new Estudiante("Sofia", 4.2);

        // Mostrar información inicial
        alumno1.mostrarInfo();
        alumno2.mostrarInfo();

        // Actualizar calificación
        System.out.println("Sofia repitio el examen!");
        alumno2.setCalificacion(8.0);

        System.out.println();

        // Mostrar informacion actualizada
        alumno2.mostrarInfo();
    }
}
import java.util.Scanner;

/*
Clasificacion de Vehiculos con Abstraccion
*/

class Main {
    public static void main(String[] args) {
        Vehiculo camion = new Camion("001");
        Vehiculo avion = new AvionCarga("002");

        double distancia = 1200;

        System.out.println("Distancia: " + distancia + " km");

        System.out.println("\nCamión");
        System.out.println("Matrícula: " + camion.getMatricula());
        System.out.println("Tiempo estimado: " + camion.calcularTiempoViaje(distancia) + " horas");

        System.out.println("\nAvión de Carga");
        System.out.println("Matrícula: " + avion.getMatricula());
        System.out.println("Tiempo estimado: " + avion.calcularTiempoViaje(distancia) + " horas");
    }
}
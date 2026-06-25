import java.util.Scanner;

/*
Se requiere un sistema para una tienda de música. Todos los Instrumentos
tienen un nombre y un precio. Todos los
instrumentos deben poder ejecutarse mediante el metodo tocar(), pero la forma en que
emiten sonido depende exclusivamente del tipo de instrumento.
*/

class Main {
    public static void main(String[] args) {
        // no s puede hacer: new Instrumento aptovechando la abstraccion
        Instrumento[] orquesta = {
                new Guitarra("Fender Stratocaster",1200.0),
                new Bateria("Yamaha Stage Custom",2500.0)
        };
        System.out.printf("--- DEMOSTRACION DE ABSTRACCION BASICA ---");
        for (Instrumento i : orquesta){
            i.tocar(); // Cada Intrumento resuelve su propia abstraccion
        }
    }
}

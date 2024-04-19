package mx.utng.s12;
/**
 * @author: Josué Alejandro Esparza Padilla
 * @date: 6/02/2024
 * @grupo: GDS0624
 */
//import java.util.Scanner;

public class Polimorfismo {
    public static void main(String[] args) {
        Venado v = new Venado();

        Animal a = v;

        Hervivoro h = v;

        Object o = v;

        //Scanner s = v;

        System.out.println("Venado: "+ (v instanceof Venado));
        System.out.println("Animal: "+ (a instanceof Animal));
        System.out.println("Hervivoro: "+ (h instanceof Hervivoro));
        System.out.println("Object: "+ (o instanceof Object));
       // System.out.println("Scanner: "+ (v instanceof Scanner));

       v.comer();

       Humano humano = new Humano();
       humano.comer();
    }
}


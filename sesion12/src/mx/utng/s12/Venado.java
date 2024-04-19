package mx.utng.s12;
/**
 * @author: Josué Alejandro Esparza Padilla
 * @date: 6/02/2024
 * @grupo: GDS0624
 */
public class Venado extends Animal implements Hervivoro{
    @Override
    public void comer() {
        System.out.println("Comiendo pasto");
    }
}

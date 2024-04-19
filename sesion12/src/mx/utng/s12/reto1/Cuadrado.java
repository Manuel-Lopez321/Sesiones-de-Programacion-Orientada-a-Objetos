package mx.utng.s12.reto1;
/**
 * @author: Josué Alejandro Esparza Padilla
 * @date: 6/02/2024
 * @grupo: GDS0624
 */
public class Cuadrado implements Figura{

    private double lado;
    {
        lado = 40;
    }
    @Override
    public void formulaCalculaArea(){
        System.out.println("El área del cuadrado es: "+ lado * lado+"\n");
    }
}


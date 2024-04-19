package mx.utng.s12.reto1;
/**
 * @author: Josué Alejandro Esparza Padilla
 * @date: 6/02/2024
 * @grupo: GDS0624
 */
public class Rectangulo implements Figura{

    private double base;
    private double altura;
    {
        base = 10;
        altura = 20;
    }
    @Override
    public void formulaCalculaArea(){
        System.out.println("El área del rectángulo es: "+ base * altura+"\n");
    }
}


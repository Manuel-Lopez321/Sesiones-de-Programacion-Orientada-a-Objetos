package mx.utng.s12.reto1;
/**
 * @author: Josué Alejandro Esparza Padilla
 * @date: 6/02/2024
 * @grupo: GDS0624
 */
public class Triangulo implements Figura{

    private double base;
    private double altura;
    {
        base = 30;
        altura = 50;
    }

    @Override
    public void formulaCalculaArea(){
        System.out.println("El área del triángulo es: "+ (base * altura) / 2+"\n");
    }
    
}

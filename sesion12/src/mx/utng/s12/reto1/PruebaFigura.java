package mx.utng.s12.reto1;
/**
 * @author: Josué Alejandro Esparza Padilla
 * @date: 6/02/2024
 * @grupo: GDS0624
 */
public class PruebaFigura {
    public static void main(String[] args) {
        
        Figura fig;

        fig = new Triangulo();
        fig.formulaCalculaArea();

        fig = new Cuadrado();
        fig.formulaCalculaArea();

        fig = new Rectangulo();
        fig.formulaCalculaArea();
    }
}


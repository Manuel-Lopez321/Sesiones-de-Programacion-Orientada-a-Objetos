package mx.utng.s11;
public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 4.0, "Color Pastel");
        System.out.println("Info. de Triangulo");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("Su área es: "+triangulo.area());

        Triangulo triangulo2 = new Triangulo(10, 20,"Color Negro");
        System.out.println("Info. de Triangulo");
        triangulo2.mostrarDimension();
        triangulo2.mostrarEstilo();
        System.out.println("Su área es: "+triangulo2.area());

        Triangulo triangulo3 = new Triangulo(2.0, 8.0, "Color Rojo");
        System.out.println("Info. de Triangulo");
        triangulo3.mostrarDimension();
        triangulo3.mostrarEstilo();
        System.out.println("Su área es: "+triangulo3.area());
    }
}
//Josué Alejandro Esparza Padilla
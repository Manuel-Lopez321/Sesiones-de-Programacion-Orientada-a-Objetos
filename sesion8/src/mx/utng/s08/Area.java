package mx.utng.s08;

public class Area {
    public static void main(String[] args) {
        
        Cuadrado c = new Cuadrado();
        System.out.println("Area; "+c.area());
    }
}

class Cuadrado{
    private int lado;

    public Cuadrado(){
        this.lado = 0;
    }

    public Cuadrado(int lado){
        this.lado = lado;
    }

    public int area(){
        return (int) Math.pow(lado, 2);
    }
}//Josué Alejandro Esparza Padilla
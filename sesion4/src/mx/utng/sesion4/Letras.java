package mx.utng.sesion4;

public class Letras {
    public static void main(String[] args) {
        // Objetos necesarios
        Lector lector = new Lector();
        ContadorCaracteres contador = new ContadorCaracteres();
        //Uso el lector para imprimir texto y leer valores
        lector.muestraMensaje("Teclea una palabra: ");
        String palabra = lector.leerEntrada();

        //Usar el contador para saber cuantos caracteres hay por cada fila
        int vocales = contador.cuentVocales(palabra);
        lector.muestraMensaje("El numero de vocales es: "+vocales);
        int consonantes = contador.cuentaConsonantes(palabra);
        lector.muestraMensaje("El numero de consonantes es: "+consonantes);
        int numeros = contador.cuentNumeros(palabra);
        lector.muestraMensaje("El numero de numeros es: "+numeros);
        int simbolos = contador.cuentSimbolos(palabra);
        lector.muestraMensaje("El numero de simbolos es: "+simbolos);
    }
}

//Josué Alejandro Esparza Padilla
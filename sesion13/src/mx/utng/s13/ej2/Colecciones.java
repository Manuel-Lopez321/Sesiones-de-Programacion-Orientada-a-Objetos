package mx.utng.s13.ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        //Parametrizacion, define el tipo de la lista
        //Lista de cadenas
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");

        System.out.println("-----Normal-----");
        System.out.println(listaCadenas);
        System.out.println("------Fori------");
        for (int i = 0; i < listaCadenas.size(); i++) {
            System.out.printf("%s%n",listaCadenas.get(i));
        }
        System.out.println("======Foreach======");
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }

        //Conjunto de cadenas
        Set<String> setCadenas = new HashSet<>();
        setCadenas.add("uno");
        setCadenas.add("dos");
        setCadenas.add("tres");
        setCadenas.add("cuatro");
        setCadenas.add("cinco");

        //Foreach para imprimir los valores
        System.out.println("======Set de Cadenas======");
        for (String cadena : setCadenas) {
            System.out.println(cadena);
        }

        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("uno"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("cuatro"));
        listaNumeros.add(new Numero("cinco"));
        //Foreach para imprimir los valores
        System.out.println("=======Lista de Numeros=====");
        for (Numero numero : listaNumeros) {
            System.out.println(numero.getNombre());
        }

        Set<Numero> setNumeros = new HashSet<>();
        setNumeros.add(new Numero("uno"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("dos"));
        setNumeros.add(new Numero("tres"));
        setNumeros.add(new Numero("cuatro"));
        setNumeros.add(new Numero("cinco"));
        //Foreach para imprimir los valores
        System.out.println("=======Set de Numeros=====");
        for (Numero numero : setNumeros) {
            System.out.println(numero.getNombre());
        }
    }
}
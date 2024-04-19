package mx.utng.s28;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Function;

public class Ejercicio2 {

    List<Integer> tranformar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){
        List <Integer> nuevaLista = new ArrayList<>();
        for (Integer value : conjunto){
            nuevaLista.add(funcion.apply(value));
        } 
        return nuevaLista;    
    }
    Integer transformarYSumar(Iterable<Integer> conjunto, Function<Integer> funcion){
        integer acumulator = 0;
        for (Integer value : conjunto) {
            acumulator+= funcion.apply(value);
            
        }
        return acumulator;
    }
}
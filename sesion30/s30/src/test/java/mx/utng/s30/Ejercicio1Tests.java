package mx.utng.s30;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ejercicio1Tests {
    @Test @DisplayName("Prueba para trasnformar y sumar")
    void canTrasnformAndAdd(){
        Ejercicio1 e1= new Ejercicio1();

        List<Integer>Conjunto = Arrays.asList(1,4,-6,7,3,5,-1);

        Integer expected = -27;

        Assertions.assertThat(e1.manipular(Conjunto, i-> i<0?i:-1)).isEqualTo(expected);


    }

}

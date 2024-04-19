package mx.utng.s11.reto1;

import java.time.LocalDate;

public class Empleado extends Persona {
    private float salario;

    public Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
//Josué Alejandro Esparza Padilla

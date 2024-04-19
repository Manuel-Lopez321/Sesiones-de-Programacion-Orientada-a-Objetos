package mx.utng.s13.ej1;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
    private LocalDate fechaTerminacion;


    public LocalDate getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(LocalDate fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    public ProfesorInterino(String nombre, String apellidos, String idProfesor, LocalDate fechaTerminacion) {
        super(nombre, apellidos, idProfesor);
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
    public void mostraDatos() {
        super.mostraDatos();
        System.out.println("Profesor Interino: Fecha de Terminación de contrato->"+fechaTerminacion);
    }
}

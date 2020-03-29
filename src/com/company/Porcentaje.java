package com.company;

public class Porcentaje implements Resultados{

    public double bonoResultados(Empleado empleado) {
        return 0.1 * empleado.getCategoria().sueldoNeto();
    }
}

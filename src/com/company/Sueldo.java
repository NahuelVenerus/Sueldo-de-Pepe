package com.company;

public class Sueldo {

    // sueldo = neto + bono x presentismo + bono x resultados.

    public double calcularSueldo(Empleado empleado, Resultados resultados) {
        return empleado.getCategoria().sueldoNeto() + empleado.getPresentismo().bono() + resultados.bonoResultados(empleado);
    }
}
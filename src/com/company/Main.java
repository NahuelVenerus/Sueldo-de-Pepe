package com.company;

public class Main {

    public static void main(String[] args) {

        Categoria cadete = new Cadete();
        Categoria gerente = new Gerente();

        Resultados porcentaje = new Porcentaje();
        Resultados fijo = new Fijo();
        Resultados sinResultados = new SinResultados();

        Presentismo sinFaltas = new SinFaltas();
        Presentismo unaFalta = new UnaFalta();
        Presentismo faltoMasDeUnaVez = new FaltoMasDeUnaVez();

        Empleado pepe = new Empleado(cadete, sinFaltas);
        System.out.println("Sueldo Neto: " +pepe.getCategoria().sueldoNeto());
        System.out.println("Bono: " + pepe.getPresentismo().bono());
        System.out.println("Resultados: " + porcentaje.bonoResultados(pepe));

        Sueldo sueldo = new Sueldo();
        System.out.println("Sueldo de Pepe: " + sueldo.calcularSueldo(pepe, porcentaje));


    }
}

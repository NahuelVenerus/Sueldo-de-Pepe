package com.company;

public class Empleado {

    private Categoria categoria;
    private Presentismo presentismo;

    public Empleado(Categoria categoria, Presentismo presentismo) {
        this.categoria = categoria;
        this.presentismo = presentismo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Presentismo getPresentismo() {
        return presentismo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "categoria=" + categoria +
                ", presentismo=" + presentismo +
                '}';
    }
}

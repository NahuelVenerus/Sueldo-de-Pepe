package com.company;

public class Cadete implements Categoria {

    @Override
    public int sueldoNeto() {
        return 1500;
    }

    @Override
    public String toString() {
        return "Cadete{}";
    }
}

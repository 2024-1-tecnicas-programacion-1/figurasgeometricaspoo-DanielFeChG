package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura){ //Complejidad temporal: O(1) Tiempo constante.
        super (nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double obtenerArea(){ //Complejidad temporal: O(1) Tiempo constante.
        return (base * altura)/2;
    }

    public double obtenerPerimetro(){ //Complejidad temporal: O(1) Tiempo constante.
        return base * 3;
    }

}
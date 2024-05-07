package com.mycompany.figurasgeometricaspoo;
public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio){ //Complejidad temporal: O(1) Tiempo constante.
        super(nombre, color);
        this.radio = radio;
    }
    public double obtenerArea(){ //Complejidad temporal: O(1) Tiempo constante.
        return Math.PI * Math.pow(radio, 2);
    }
    public double obtenerPerimetro(){ //Complejidad temporal: O(1) Tiempo constante.
        return 2*Math.PI*radio;
    }

}
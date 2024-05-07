package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color, double lado1, double lado2){ //Complejidad temporal: O(1) Tiempo constante.
        super(nombre,color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double obtenerArea(){ //Complejidad temporal: O(1) Tiempo constante.
        return lado1 * lado2;
    }

    public double obtenerPerimetro(){ //Complejidad temporal: O(1) Tiempo constante.
        return (lado1*2)+(lado2*2);
    }

}
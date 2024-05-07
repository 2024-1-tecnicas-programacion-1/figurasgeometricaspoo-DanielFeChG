package com.mycompany.figurasgeometricaspoo;
public class FiguraGeometrica {
    private String nombre;
    private String color;

    FiguraGeometrica (String nombre, String color){ //Complejidad temporal: O(1) Tiempo constante.
        this.nombre = nombre;
        this.color = color;
    }

    public double obtenerArea(){ //Complejidad temporal: O(1) Tiempo constante.
        return 0;
    }

    public double obtenerPerimetro(){ //Complejidad temporal: O(1) Tiempo constante.
        return 0;
    }

    public String getNombre(){ //Complejidad temporal: O(1) Tiempo constante.
        return this.nombre;
    }

    public String getColor(){ //Complejidad temporal: O(1) Tiempo constante.
        return this.color;
    }

    public void setNombre(String nombre){ //Complejidad temporal: O(1) Tiempo constante.
        this.nombre = nombre;
    }

    public void setColor(String color){ //Complejidad temporal: O(1) Tiempo constante.
        this.color = color;
    }

}
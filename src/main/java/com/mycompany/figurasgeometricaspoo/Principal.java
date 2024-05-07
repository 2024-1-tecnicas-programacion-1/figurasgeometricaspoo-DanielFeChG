package com.mycompany.figurasgeometricaspoo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { //Complejidad lineal: O(N) Tiempo lineal.
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Ingrese el nombre de la figura:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el color de la figura:");
        String color = sc.nextLine();
        boolean validacionMenu = false;
        String figura = "";
        double radio, lado1, lado2, base, altura;
        
        while(validacionMenu != true){
            System.out.println("Ingrese el tipo de figura:\n1) Circulo\n2) Rectangulo\n3) Triangulo (equilatero)");
            int opcion = sc.nextInt();
       
            switch (opcion) {
                case 1:
                    figura = "circulo";
                    System.out.println("Ingrese el radio del circulo.");
                    radio = sc.nextDouble();
                    Circulo circulo1 = new Circulo(nombre, color, radio);
                    System.out.println("El area del " + figura + " es: " + df.format(circulo1.obtenerArea()));
                    System.out.println("El perimetro del " + figura + " es: " + df.format(circulo1.obtenerPerimetro()));
                    validacionMenu = true;
                    break;

                case 2:
                    figura = "rectángulo";
                    System.out.println("Ingrese el valor del lado 1 del rectángulo.");
                    lado1 = sc.nextDouble();
                    System.out.println("Ingrese el valor del lado 2 del rectángulo.");
                    lado2 = sc.nextDouble();
                    Rectangulo rectangulo1 = new Rectangulo(nombre, color, lado1, lado2);
                    System.out.println("El area del " + figura + " es: " + df.format(rectangulo1.obtenerArea()));
                    System.out.println("El perimetro del " + figura + " es: " + rectangulo1.obtenerPerimetro());
                    validacionMenu = true;
                    break;

                case 3:
                    figura = "triangulo";
                    System.out.println("Ingrese el valor de la base del triangulo.");
                    base = sc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del triangulo.");
                    altura = sc.nextDouble();
                    Triangulo triangulo1 = new Triangulo(nombre, color, base, altura);
                    System.out.println("El area del " + figura + " es: " + df.format(triangulo1.obtenerArea()));
                    System.out.println("El perimetro del " + figura + " es: " + triangulo1.obtenerPerimetro());
                    validacionMenu = true;
                    break;
            
                default:
                System.out.println("Escoja una opción válida");
                    break;
            }
        }
    }
}

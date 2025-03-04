package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

    /*
    1. Modularización: Divide el código en métodos más pequeños y específicos para mejorar la legibilidad y el mantenimiento.
    2. Uso de constantes: Define constantes para valores que se repiten o tienen un significado especial.
    3. Manejo de recursos: Asegúrate de cerrar el Scanner al final para liberar recursos.
    4. Validación de entrada: Agrega validaciones para las entradas del usuario para manejar posibles errores.
    5. Comentarios y formato: Mejora los comentarios y el formato del código para mayor claridad.
    6. Uso de genéricos: Especifica el tipo de la lista números para evitar advertencias de tipo.
    7. Corrección de errores: Corrige el error en el cálculo del módulo, que debería ser numk % 2.0 en lugar de numk % 2.
    8. Mejora de la precisión: Usa double en lugar de float para mayor precisión en los cálculos.

    Actualmente el programa cuanta con fallos, por ejemplo al ingresar una letra en lugar de un numero, el programa se cae.

    */
    public static List<Integer> numeros = new ArrayList();
    private static Scanner input = new Scanner(System.in);

    public Calculadora() {
    }

    public static void sumar() {
        System.out.println("Cuantos numeros deseas sumar: ");
        int cantidad = input.nextInt();

        for(int i = 0; i < cantidad; ++i) {
            System.out.println("Ingresa el numero " + i + ": ");
            int num = input.nextInt();
            numeros.add(num);
        }

        int contador = 0;

        for(int numero : numeros) {
            contador += numero;
        }

        System.out.println("La suma total de los numeros ingresados es de: " + contador);
        numeros.clear();
    }

    public static void restar() {
        System.out.println("Ingresa el primer numero: ");
        double x = input.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        double y = input.nextDouble();
        System.out.println("El resultado de la resta es de: " + (x - y));
    }

    public static void multiplicar() {
        System.out.println("Cuantos numeros quieres multiplicar? ");
        int total = input.nextInt();

        for(int i = 0; i < total; ++i) {
            System.out.println("Ingresa el numero " + i + ":");
            int numx = input.nextInt();
            numeros.add(numx);
        }

        int contador = 1;

        for(int numero : numeros) {
            contador *= numero;
        }

        System.out.println("La multiplicacion total tiene un resultado de: " + contador);
        numeros.clear();
    }

    public static void dividir() {
        System.out.println("Ingresa el numero a dividir: ");
        double num1 = input.nextDouble();
        System.out.println("Ingresa el divisor:");
        double num2 = input.nextDouble();
        System.out.println("El resultado de la division es de: " + num1 / num2);
    }

    public static void potencia() {
        System.out.println("Ingresa el numero a calcular potencia: ");
        double numd = input.nextDouble();
        System.out.println("Ingresa la potencia: ");
        double numf = input.nextDouble();

        double var10001 = Math.pow(numd, numf);
        System.out.println("El resultado de esa potencia es de: " + var10001);
    }

    public static void raiz() {
        System.out.println("Ingresa el numero a sacar raiz: ");
        double numj = input.nextDouble();
        System.out.println("La raiz cuadrada del numero es de: " + Math.sqrt(numj));
    }

    public static void ln() {
        System.out.println("Ingresa el numero: ");
        double numgh = input.nextDouble();
        System.out.println("El logaritmo Natural del numero es: " + Math.log(numgh));
    }

    public static void modulo() {
        System.out.println("Ingresa el numero a calcular su residuo o modulo: ");
        double numk = input.nextDouble();
        System.out.println("El residuo del numero ingresado es de: " + numk % (double)2.0F);
    }

    public static void Menu() {
        boolean finalizado = false;

        while(!finalizado) {
            System.out.println("--------------------------------");
            System.out.println("Bienvenido a la calculadora");
            System.out.println("Que quieres hacer?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz Cuadrada");
            System.out.println("7. Logaritmo Natural");
            System.out.println("8. Modulo");
            System.out.println("9. Salir");
            int eleccion = input.nextInt();
            switch (eleccion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    potencia();
                    break;
                case 6:
                    raiz();
                    break;
                case 7:
                    ln();
                    break;
                case 8:
                    modulo();
                    break;
                case 9:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Gracias por usar la calculadora, hasta la proxima! :)");
                    finalizado = true;
                    break;
                default:
                    System.out.println("Opcion errada, intenta otra vez");
            }
        }

    }


}





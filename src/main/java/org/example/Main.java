package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome");

        Scanner entrada = new Scanner(System.in);
        //Ejemplos de datos primitivos
        //Tipos de dato numérico
        //(byte, short, int, long) enteros

        //Ejemplo de byte (-128--127)
        System.out.println("Por favor ingrese su edad ´por favor: ");
        byte edad = entrada.nextByte();
        System.out.println("Su edad es: "+edad);

        //Ejemplo short (-32,768--32,767)
        System.out.println("Ingrese su estatura (en cm)");
        short estaturacm = entrada.nextShort();
        System.out.println("La estatura indicada es de: "+estaturacm+"cm");

        //Ejemplo de int (-2,147,483,648--2,147,483,647)
        System.out.println("Por favor indique su número de documento sin puntos ni comas");
        int document = entrada.nextInt();
        System.out.println("Su número de documento es: "+document);

        //Ejemplo de long (se necesita agregar una "L" o "l" al número
        //calculando la distancia en m de un astro a la tierra según su distancia en años luz
        long añoLuzenMetros = 9461000000000000L;
        //distancia de alpha centauri en años luz
        double distanciaAlpha = 4.37;
        //distancia alpha centauri en metros
        //hay que convertir distanciaAlpha a long
        long distanciaAlphaMetros = añoLuzenMetros*(long)distanciaAlpha;
        System.out.println("La distancia de Alpha Centauri a la Tierra es de "+distanciaAlphaMetros+" metros.");


        //Tipos de dato decimal (float, double)

        //Ejemplo de float (se necesita agregar "f" o "F" al número
        float velocidad = 120.5f;
        System.out.println("La velocidad a la que iba el auto era de: "+velocidad+" km/h");

        //Ejemplo de double
        System.out.println("Precio de un producto después de aplicar un descuento");
        int valor_producto = 210;
        double valor_final = valor_producto-(valor_producto*0.15);
        System.out.println("El precio del producto con el descuento es de: $"+valor_final);

        //Tipo de dato char (almacena caracteres unicode
        //Ejemplo de char
        System.out.println("Son ciudades alemanas: ");
        System.out.println("A. Munich, Frankfurt, Amsterdam, Copenague");
        System.out.println("B. Berlín, Dortmund, Bremen, Munich");
        System.out.println("C. Zurich, Stuttgart, Berlín, Praga");
        System.out.println("D. Colonia, Munich, Ginebra, Bruselas");
        //El siguiente método es para que se lea siempre el primer caracter dado que no existe un .nextchar()
        char opcion_usuario = entrada.next().charAt(0);

        if (opcion_usuario == 'B' || opcion_usuario == 'b') {
            System.out.println("Correcto!");
        }else{
            System.out.println("Incorrecto:(");
        }

        //Tipos de dato boolean (almacena cierto o falso)
        //Ejemplo de boolean
        System.out.println("Ingrese un  numero para verificar si es par o impar");
        int numero = entrada.nextInt();
        boolean esPar = (numero%2==0);
        if (esPar){
            System.out.println("El número "+numero+" es par");
        }else{
            System.out.println("El número "+numero+" es impar");
        }

        //---Operadores---//

        //Variables
        int a=5;
        int b=6;

        //---Aritméticos--//
        System.out.println("--ARITMETICOS---");
        int suma = a + b; // Suma
        int resta = a - b; // Resta
        int multiplicacion = a * b; // Multiplicación
        double division = 30.0/ 10.0; // División se utiliza double
        int modulo = b % a ; // Resto de la división
        System.out.println("Suma= "+suma);
        System.out.println("Resta="+resta);
        System.out.println("Multiplicacion= "+multiplicacion);
        System.out.println("Division= "+division);
        System.out.println("Modulo= "+modulo);

        //---LOGICOS---//
        System.out.println("----LOGICOS---");
        boolean and = (b > a) && (a < b); // AND (ambas condiciones deben ser verdaderas)
        boolean or = (b > a) || (a > b); // OR (al menos una condición debe ser verdadera)
        boolean not = !(b > a); // NOT (invierte la condición)

        System.out.println("AND= "+and);
        System.out.println("OR= " +or);
        System.out.println("NOT= "+not);

        //---RELACIONALES (COMPARACION)---//
        int a1=5;
        int b1=4;
        System.out.println("---RELACIONALES---");
        System.out.println("Igualdad-->a1 == b1: " + (a1 == b1));//Igualdad
        System.out.println("Diferente-->a1 != b1: " + (a1 != b1));//Diferente
        System.out.println("Mayor que-->a1 > b1: " + (a1 > b1));//Mayor que
        System.out.println("Menor que-->a1 < b1: " + (a1 < b1));//Menor que
        System.out.println("Mayor o igual-->a1 >= b1: " + (a1 >= b1));//Mayor o igual
        System.out.println("Menor o igual-->a1 <= b1: " + (a1 <= b1));//Menor o igual

        //---ASIGNACIÓN---//

        System.out.println("---ASIGNACION---");

        //Asignación simple
        int s = 7;
        System.out.println("Asignacion simple--> s=7: " +s);
        //Suma y asignación
        s += 5;
        System.out.println("Suma y asignacion--> s += 5: " + s);
        //Resta y asignación
        s -= 2;
        System.out.println("Resta y asignacion-->s -= 2: " + s);
        //Multiplicación y asignación
        s *= 3;
        System.out.println("Multiplicacion y asignacion--> s *= 3: " + s);
        //División y asignación
        s/= 2;
        System.out.println("Division y asignacion--> s /= 2: " + s);
        //Módulo y asignación
        s %= 3;
        System.out.println("Modulo y asignacion--> s %= 3: " + s);

        //---INCREMENTO Y DECREMENTO---//

        System.out.println("---INCREMENTO Y DECREMENTO---");

        int i=2;

        System.out.println("Incremento en 1--> i++: " + (i++)); //Incremento en 1
        System.out.println("Valor despues de i++: "+i);
        System.out.println("Incremento en 1--> ++i: " + (++i)); // Incremento en 1
        System.out.println("Decremento en 1--> i--: " + (i--)); // Decremento en 1
        System.out.println("Valor despues de i--:"+i);
        System.out.println("Decremento en 1--> --i: " + (--i)); // Decremento en 1


        //---TERNARIO---//

        System.out.println("---TERNARIO---");

        //variable = (condición) ? valor_si_verdadero : valor_si_falso;

        int age = 15;
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje); // Imprime "Menor de edad"

        int num=-2;
        String resultado = (num >= 0) ? "Numero positivo" : "Numero negativo";
        System.out.println(resultado); // Imprime "Número negativo"

        //---BIT A BIT---//

        //Manipula los bits individuales de los números enteros
        int x = 5;  // 0101 en binario
        int y = 3;  // 0011 en binario
        System.out.println("---BIT A BIT---");
        System.out.println("AND--> x & y = " + (x & y));  // 0001 -> 1
        System.out.println("OR--> x | y = " + (x | y));  // 0111 -> 7
        System.out.println("XOR--> x ^ y = " + (x ^ y));  // 0110 -> 6
        System.out.println("NOT--> ~x = " + (~x));        // Complemento de 5 -> -6
        System.out.println("Desplazamiento a la izquierda--> x << 1 = " + (x << 1)); // 1010 -> 10
        System.out.println("Desplazamiento a la derecha--> x >> 1 = " + (x >> 1)); // 0010 -> 2
        System.out.println("Desplazamiento a la derecha sin signo--> x >>> 1 = " + (x >>> 1)); // 0010 -> 2
        }
    }

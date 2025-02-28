package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! Ing Alejandro");

        Scanner entrada = new Scanner(System.in);
        //Ejemplos de datos primitivos
        //Tipos de dato numérico
        //(byte, short, int, long) enteros

        //Ejemplo de byte (-128--127)
        System.out.println("Por favor ingrese su edad: ");
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
        }
    }
}
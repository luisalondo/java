package co.edu.sena.opp2902274;

import java.io.Console;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    //Punto 1 "Area de un triangulo"
    public static void main( String[] args )
    {
        //Entradas
        System.out.println( "Calcula el area de un triangulo" );
        System.out.println( "1. Ingresa la base del triangulo" );

        Scanner src = new Scanner(System.in);
        double base = src. nextDouble();

        System.out.println("2. Ingresa la altura del triangulo");
        double height = src. nextDouble();

        //Preceso

        double result =(base*height) /2;

        //Salida 

        System.out.print("El area del triangulo es:" + result);

        
        //Punto 2 "Suma de dos numeros"

        //Entrada 

        System.out.println("Ingresar dos numeros por teclado y sumarlos");
        System.out.println("1. Ingrese el primer número:");


        Scanner sum= new Scanner(System.in);
        int num1 =src.nextInt();
        
        System.out.println("2. Ingrese el segundo número");
        int num2 = src.nextInt();


        //Proceso 

        int suma =(num1 + num2);


        //Salida

        System.out.println( "La suma de los dos numeros es: " + suma);

        //Punto 3 "Ingresa un numero y visualizar el numero elevado al cuadrado"

        //Entrada 

        System.out.println( "Ingresa un numero y visualizar el numero elevado al cuadrado" );
        System.out.println( "1. Ingresa un numero" );

        Scanner cua = new Scanner(System.in);
        double number = cua.nextDouble();

        //Proceso

        double square = number * number;

        //Salida

        System.out.println("El cuadrado del número es: " + square);
        

        //Punto 4 "Algoritmo que convierta de euros a dòlares"

        //Entrada 

        System.out.println( "Algoritmo que convierta de euros a dòlares" );
        System.out.println( "1. Ingresa la cantidad en euros:" );

        Scanner cov = new Scanner(System.in);
        double euros = cov.nextDouble();

        //Proceso 

        double dolares = (euros * 1.00);

        //Salida

        System.out.println("La cantidad en dólares es: " + dolares);

        //Punto 5 "Algoritmo que pida el lado de un cuadrado y muestre el valor del area y del perimetro"

        //Entrada 

        System.out.println( "Algoritmo que pida el lado de un cuadrado y muestre el valor del area y del perimetro" );
        System.out.println( "1. Ingresa el lado del cuadro: " );

        Scanner cuad = new Scanner(System.in);
        double side = cuad.nextDouble();

        //Proceso

        double area = side * side;
        double perimetro = 4 * side;

        //salida

        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        //Punto 6 "Algoritmo que determine el area y el volumen de un cilindro"

        //Entrada 

        System.out.println( "Algoritmo que determine el area y el volumen de un cilindro" );
        System.out.println( "1. Ingresa el radio del cilindro: " );

     



        //Punto 7 "Algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el area (pi*r)^2 del circulo inscrito"

        //Entrada

        System.out.println( "Algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el area (pi*r)^2 del circulo inscrito" );
        System.out.println( "1. Ingresa el radio de la circunferencia: " );

        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();

        //Proceso 

        double circumferenci = 2 * Math.PI * radio;
        double circumArea = Math.PI * Math.pow(radio / 2, 2);

        //Salida

        System.out.println("La longitud de la circunferencia es: " + circumferenci);
        System.out.println("El área del círculo inscrito es: " + circumArea);

        //Punto 8 "Calcula el promedio de tres (3) numeros ingresados por teclado"

        //Entrada 

        System.out.println( "Calcula el promedio de tres (3) numeros ingresados por teclado" );
        
        System.out.println("1. Ingrese el primer número");
        int number1 = src.nextInt();

        System.out.println("2. Ingrese el segundo número");
        int number2 = src.nextInt();

        System.out.println("2. Ingrese el segundo número");
        int number3 = src.nextInt();

        //Proceso

        double perime = (number1 + number2 + number3) / 3;

        //Salida

        System.out.println("El promedio de los tres números es: " + perime);

    }
}

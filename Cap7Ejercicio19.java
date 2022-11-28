/**
 * Author:Pablo Camino Vázquez
 * 19) Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 */

import java.util.Scanner;

public class Cap7Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] numeros = new int [12];
        int posicionPedido = 0;
        int numeroPedido = 0;

        System.out.println("El array inicial sería: "); //Mostramos el array sin modificar
        System.out.print("Índice");
        for(int i = 0; i <12 ; i++){
            System.out.printf("%7s" , i);
        }
        System.out.println("");
        for(int i = 0; i<12;i++){ //creamos el array
            numeros [i] = (int)(Math.random()*201);
        }
        System.out.print("Valor ");
        for(int i = 0; i <numeros.length ; i++){
            System.out.printf("%7s" , numeros[i]);
        }

        System.out.println("");

        System.out.print("Dime el número que quieres ingresar: ");
        numeroPedido = sc.nextInt();
        do {
            System.out.print("Dime la posición en la que lo quieres ingresar (0-11): ");
            posicionPedido = sc.nextInt();
        } while (posicionPedido<0 || posicionPedido>11);

        for(int i = numeros.length-1 ;i>posicionPedido;i--){ //Rotamos hacia la derecha desde la posicion que nos han pedido hasta la última posición del array
            numeros[i] = numeros[i-1];
        }
        numeros[posicionPedido] = numeroPedido; //Como está repetido el valor de la posición y el siguiente le damos el valor de la posición deseada con el número pedido

        System.out.println("");
        System.out.println("El array modificado sería: "); //Mostramos el array 
        System.out.print("Índice");
        for(int i = 0; i <12 ; i++){
            System.out.printf("%7s" , i);
        }
        System.out.println("");
        System.out.print("Valor ");
        for(int i = 0; i <numeros.length ; i++){
            System.out.printf("%7s" , numeros[i]);
        }
        sc.close();
    }
}
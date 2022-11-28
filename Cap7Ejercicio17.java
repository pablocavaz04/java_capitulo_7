/**
 * Author: Pablo Camino Vázquez
 * 17) Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha
 * las veces que haga falta hasta que el número introducido quede situado en la
 * posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 */

import java.util.Scanner;

public class Cap7Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int [] numeros = new int [20];
        boolean igual = false;
        int numeroPedido = 0;
        int aux = 0;

        for(int i = 0; i<20;i++){ //Creamos el array y le damos los valores
            numeros [i] = (int)(Math.random()*101);
            System.out.print(numeros[i] + " ");
        }

        System.out.println("");

        do { //Para saber si el número está en el array o no
            System.out.print("Dime un número para ver si está en el array: ");
            numeroPedido = sc.nextInt();

            for(int i = 0; i<20;i++){
                if(numeros[i]==numeroPedido){
                    igual = true;
                }
            }
        } while (!igual); //Salimos si está el número en el array

        
        do { 
            aux = numeros [19]; //Guardamos el último valor para no perderlo
            for(int i = numeros.length-1 ; i>0 ; i--){ //Vamos a rotar el array
                numeros[i] = numeros[i-1];
            }
            numeros [0] = aux; //Cambiamos el primer número por el último, ya que saldría 2 veces repetido el primero
        } while (numeros[0]!=numeroPedido);

        for(int i = 0; i<20;i++){
            System.out.print(numeros[i] + " ");
        }
        sc.close();
    }
}
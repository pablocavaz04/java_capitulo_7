/*
 * Author:Pablo Camino Vázquez
 * 10) Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.
 */
public class Cap7Ejercicio10 {
    public static void main(String[] args) {
    int[] original = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];

    int i;

    int pares = 0;
    int impares = 0;

    for (i = 0; i < 20; i++) {
        original[i] = (int)(Math.random() * 101);
        if (original[i] % 2 == 0) {
            par[pares++] = original[i];
        } else {
            impar[impares++] = original[i];
        }
    }

    System.out.println("Array original:");
    for (i = 0; i < 20; i++) {
        System.out.print(original[i] + " ");
    }
    System.out.println();

    for (i = 0; i < pares; i++) {
        original[i] = par[i];
    }

    for (i = pares; i < 20; i++) {
        original[i] = impar[i - pares];
    }

    System.out.println("Array con los pares al principio:");
    for (i = 0; i < 20; i++) {
        System.out.print(original[i] + " ");
    }

    }   
}


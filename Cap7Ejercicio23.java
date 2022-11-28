/**
 * Author: Pablo Camino Vázquez
 * 23) Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 */

import java.util.Scanner;

public class Cap7Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] [] num = new int [4] [5]; // [i] [j]

        int numero = 0;
        int sumatot = 0;
        int numero2 = 0; 
        int sumai = 0;
        int sumaj = 0;

        for (int i = 0;i<4;i++){ //Creamos el array e introducimos los números en 
            for (int j = 0;j<5;j++){
                System.out.print("Dime un número: ");
                numero = sc.nextInt();
                num [i][j] = numero;
            }
        }

        for(int i = 0;i<4;i++){ //SUMAR FILAS
            sumai = 0;
            for (int j = 0;j<5;j++){
                System.out.printf("%6d |",num [i][j]);
                sumai = sumai + num [i][j];
            }
            System.out.printf("|%6d\n",sumai);
        }

        for (int j = 0;j<5;j++){
            System.out.print("---------");
        }
        System.out.println("---------");

        for (int j = 0;j<5;j++){//SUMAR COLUMNAS
            sumaj = 0;
            for(int i = 0;i<4;i++){
                sumaj = sumaj + num[i][j];
            }
            System.out.printf("%7d ",sumaj);
        }

        for(int i=0 ; i<4 ; i++){ //SUMA TOTAL DE LOS NÚMEROS QUE HAY
            for (int j = 0;j<5;j++){
                numero2 = num [i][j];
                sumatot = numero2+sumatot;
            }
        }
        System.out.printf("%7d",sumatot);
        sc.close();
    }
}
/**
 * Author: Pablo Camino Vázquez
 * 13) Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 
 * 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 * 
 * 
 */

import java.util.Scanner;

public class Cap7Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] num = new int [100];
        int min = 501;
        int max = 0;

        for(int i = 0; i <100 ; i++){
            num [i] = (int)(Math.random()*501);
            System.out.print(num[i] + " ");
        }
        
        System.out.println("");
        System.out.println("1) Mínimo");
        System.out.println("2) Máximo");
        System.out.print("Que dato quieres sacar: ");
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
            for(int i = 0; i<100;i++){ //comprobamos número a número del array cuál es menor, y lo guardamos en mínimo para su posterior uso
                if(num[i]<min){
                    min = num[i];
                } 
            }
            for(int i = 0; i<100;i++){ 
                if(num[i]==min){
                    System.out.print("**"+num[i]+"** ");
                } else{
                    System.out.print(num[i] + " ");
                }
            }
            break;

            case 2:
            for(int i = 0; i<100;i++){ //comprobamos número a número del array cuál es mayor, y lo guardamos en mínimo para su posterior uso
                if(num[i]>max){
                    max = num[i];
                } 
            }
            for(int i = 0; i<100;i++){
                if(num[i]==max){
                    System.out.print("**"+num[i]+"** ");
                } else{
                    System.out.print(num[i] + " ");
                }
            }
            break;
        }
        sc.close();
    }
}
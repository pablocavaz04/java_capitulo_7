/**
 * Author: Pablo Camino Vázquez
 * 14) Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 */

import java.util.Scanner;

public class Cap7Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] palabras = new String [8];
        boolean color;

        for(int i = 0;i<8;i++){
            System.out.print("Dime una palabra: ");
            palabras[i] = sc.next();
        }

        for(int i = 0;i<8;i++){
            if(palabras[i].equals("verde") || palabras[i].equals("rojo") || palabras[i].equals("azul") || palabras[i].equals("amarillo") || palabras[i].equals("raranja") || palabras[i].equals("rosa") || palabras[i].equals("negro") || palabras[i].equals("blanco") || palabras[i].equals("morado")){
                System.out.print(palabras[i] + " ");
            }
        }
        
        for(int i = 0;i<8;i++){
            color = false;
            if(palabras[i].equals("verde") || palabras[i].equals("rojo") || palabras[i].equals("azul") || palabras[i].equals("amarillo") || palabras[i].equals("raranja") || palabras[i].equals("rosa") || palabras[i].equals("negro") || palabras[i].equals("blanco") || palabras[i].equals("morado")){
                color = true;
            }

            if(!color){
                System.out.print(palabras[i] + " ");
            }
        }
        sc.close();
    }
}
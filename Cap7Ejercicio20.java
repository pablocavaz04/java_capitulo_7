/**
 * Author: Pablo Camino Vázquez
 * 20) Implementa un programa que calcule la denominación ordinal de los reyes de
 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
 * van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
 * por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
 * por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
 * aparecer como Felipe 1º y el segundo como Felipe 2º.
 */

import java.util.Scanner;

public class Cap7Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime cuantos reyes vas a añadir: ");
        int longitud = sc.nextInt();
        int cont = 0;
        String [] reyes = new String [longitud];

        for(int i = 0; i<longitud;i++){ //Creamos el array
            System.out.print("Dime el nombre de un rey: ");
            reyes[i] = sc.next();
            cont = 0;
            for(int j = 0;j<=i;j++){
                if(reyes[j].equals(reyes[i]) || reyes[j].equals(reyes[i]+" "+(cont+1))){
                    cont++;
                }
            }
            if(cont!=0){
                reyes[i] += " "+cont;
            }
        }
        for(String r:reyes){
            System.out.println(r+ "º");
        }

        sc.close();
    }
}
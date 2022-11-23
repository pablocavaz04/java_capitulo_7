/*
 * Author: Pablo Camino Vázquez
 * 5) Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.
 */
import java.util.Scanner;
public class Cap7Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];
        int maximo = Integer.MAX_VALUE;
        int minimo = Integer.MIN_VALUE;
        
        for(int i=0;i<10;i++){
            //Ahora vamos a asignar a cada casilla del array el numero introducido.
            System.out.print("Introduzca un numero: ");
            numeros[i] = sc.nextInt();
            //Ahora vamos a asignar el maximo valor a la variable integer maximo
            if(numeros[i]>maximo){
                maximo=numeros[i];
            }
            //Ahora vamos a asignar el minimo valor a la variable integer minimo
            if(numeros[i]<minimo){
                minimo=numeros[i];
            }
        }
        System.out.println();

        for(int i=0;i<10;i++){
            //Ahora comprobamos cuando el numero sea maximo o minimo
            if(maximo==numeros[i]){
                System.out.println(numeros[i]+" maximo ");
            }

            if(minimo==numeros[i]){
                System.out.println(numeros[i]+" minimo");
            }
            else{
                System.out.println(numeros[i]);
            }

        }
        sc.close();
    }
}

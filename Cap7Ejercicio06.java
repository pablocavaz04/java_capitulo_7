/*
 * Author:Pablo Camino Vázquez
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
 */
import java.util.Scanner;
public class Cap7Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [15];
        for(int i=1;i<16;i++){
            if(i==15){
                System.out.print("Introduzca un numero: ");
                numeros [0]=sc.nextInt();
            }else{
            System.out.print("Introduzca un numero: ");
            numeros [i]=sc.nextInt();
            }
        }

        for(int i=0;i<15;i++){
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}

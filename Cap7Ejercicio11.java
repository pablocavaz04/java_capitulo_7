/*
 * Author:Pablo Camino Vázquez
 * 10) Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.
 */
import java.util.Scanner;
public class Cap7Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Pedimos 10 numeros por teclados y lo almacenamos en un arraid
        int [] numeros = new int[10];
        System.out.println("Introduzca 10 numeros por teclado: ");
        for(int i=0;i<10;i++){
            numeros[i]=sc.nextInt();
        }


        //Ahora vamos a comprobar cuales son numeros primos y meterlos en un array y sumar un contador para los primos y no primo 

        boolean esprimo=true;
        int cont_primos=0;
        int cont_noprimos=0;
        int [] primos = new int [10];
        int [] noprimos = new int [10];


        for(int i=0;i<10;i++){
            for(int j=2;j<=(numeros[i]/2);j++){
                if(numeros[i]%j==0){
                    esprimo=false;
                }
            }
            if(esprimo){
                primos[cont_primos++]=numeros[i];
            }else{
                noprimos[cont_noprimos++]=numeros[i];
            }
        }


        //Ahora vamos a añadir al array orignal primero los numeros primos
        for(int i=0;i<cont_primos;i++){
            numeros[i]=primos[i];
        }

        //Ahora vamos a añadir al array original el resto de numeros que deben de ser los no primo
        for(int i=cont_primos;i<cont_noprimos+cont_primos;i++){
            numeros[i]=noprimos[i-cont_primos];
        }

            System.out.println();
        for(int i=0;i<10;i++){
        System.out.print(numeros[i]+" ");
    }





            
    }
}

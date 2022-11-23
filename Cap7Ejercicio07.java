/*
 * Author: Pablo Camino Vázquez
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
 */
import java.util.Scanner;
public class Cap7Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Vamos a rellenar los 100 huecos del arraid con numeros aleatorios
        int [] numero = new int[100];
        for(int i=0;i<100;i++){
            numero[i] = (int)(Math.random()*21);
            System.out.print(numero[i]+ " " );
        }
        System.out.println();

        System.out.print("Introduzca el numero que quieres cambiar de valor ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el valor por el que lo quieres cambiar ");
        int num2 = sc.nextInt();
        //Ahora vamos a comparar si el numero aleatorio del array es el mismo que quiero cambiar y lo vamos a sustituir
        for(int i=0;i<100;i++){
            if(num1==numero[i]){
                numero[i]=num2;
                System.out.print("\"" + numero[i] + "\" ");
            }
            System.out.print(numero[i]+" ");
        }

        sc.close();
    }
}

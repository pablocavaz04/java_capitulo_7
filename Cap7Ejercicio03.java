/*
 * Author:Pablo Camino Vázquez
 * 3 ) Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
 */
import java.util.Scanner;
public class Cap7Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[10];
        for(int i= 9; i>=0;i--){
            System.out.print("Introduzca un número: ");
            nums [i] = sc.nextInt();
        }
        for(int j=0;j<10;j++){
            System.out.println(nums[j]);
        }
        sc.close();
    }
}

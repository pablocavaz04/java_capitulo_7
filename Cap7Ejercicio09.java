/*
 * 9) Author: Pablo Camino Vázquez
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.
 */
import java.util.Scanner;
public class Cap7Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[8];
        for(int i=0;i<8;i++){
            System.out.println("Introduzca numeros enteros");
            numeros[i]=sc.nextInt();
            }

            for(int i=0;i<8;i++){
                if(numeros[i]%2==0){
                    System.out.println(numeros[i]+" par");
                }else{
                    System.out.println(numeros[i]+" impar");
                }
            }
        

        sc.close();
    }
}

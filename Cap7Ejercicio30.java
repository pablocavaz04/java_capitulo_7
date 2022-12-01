/**
 * Author: Pablo Camino Vázquez
 * 30) Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
 * 12 filas por 12 columnas y debe contener números generados al azar entre 0 y
 * 100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
 * con los números convenientemente alineados.
 *
 */


public class Cap7Ejercicio30 {
    public static void main(String[] args) {
        int [][] num = new int [12][12];
        int [][] aux = new int [num.length][num.length]; 

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = (int)(Math.random()*21+1);
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.printf("%5d",num[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                aux[i][num.length-1-j] = num [j] [i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.printf("%5d",aux[i][j]);;
            }
            System.out.println();
        }
    }
}
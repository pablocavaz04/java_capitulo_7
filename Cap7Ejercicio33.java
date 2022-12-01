/**
 * Author: Pablo Camino Vázquez
 * 33) Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 */


public class Cap7Ejercicio33 {
    public static void main(String[] args) {
        int [] [] num = new int [9][9];
        int min = 901;
        int max = 500;
        int suma = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num [i][j] = (int)(Math.random()*401+500);

                if(i+j == num.length-1){
                    System.out.printf("%5d",num[i][j]);

                    if(num[i][j] < min){
                        suma += num[i][j];
                        min = num[i][j];
                    }
                    if(num[i][j] > max){
                        suma += num[i][j];
                        max = num[i][j];
                    }
                } else{
                    System.out.printf("%5d", 0);
                }
                if(j==8){
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("El mínimo es: " + min);
        System.out.println("El máximo es: " + max);
        System.out.println("La media es: " + (suma/9));
    }
}
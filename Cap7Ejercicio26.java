/**
 * Author:Pablo Camino Vázquez
 * 26) Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 */


public class Cap7Ejercicio26 {
    public static void main(String[] args) {
        int minimo = 1002;
        int maximo = 0;

        int minimofila = 0;
        int maximofila= 0;
        int minimocolumna = 0;
        int maximocolumna= 0;

        int [] [] num = new int [6] [10];

        for(int i = 0;i<6;i++){
            for(int j = 0; j<10;j++){
                num [i][j] = (int)(Math.random()*1001);
            }
        }
        
        for(int i = 0;i<6;i++){
            for(int j = 0; j<10;j++){
                System.out.printf("%5d ", num[i][j]);
                if(num[i][j] < minimo){
                    minimo = num[i][j];
                    minimofila = i;
                    minimocolumna = j;
                }
    
                if(num[i][j] > maximo){
                    maximo = num[i][j];
                    maximofila = i;
                    maximocolumna = j;
                }
            }
            System.out.println("│");
        }

        System.out.println("La posicion mínima es " + minimofila + ", " + minimocolumna);
        System.out.println("La posicion máxima es " + maximofila + ", " + maximocolumna);
    }
}
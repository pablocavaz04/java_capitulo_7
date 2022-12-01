/**
 * Author: Pablo Camino Vázquez
 *  34) Realiza un programa que calcule la estatura media, mínima y máxima en
 * centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los países se deben mostrar utilizando el array de países (no se pueden escribir
 * directamente).
 */


public class Cap7Ejercicio34 {
    public static void main(String[] args) {
        int [] [] num = new int [4] [10];
        String [] pais = {"España", "Rusia", "Japón","Australia"};

        System.out.printf("%53sMED MIN MAX\n"," ");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%9s: ",pais[i]);        
            int max = 140;
            int min = 210;
            int cont = 0;
            int sumai = 0;
            for (int j = 0; j < 10; j++) {
                num [i][j] = (int)((Math.random()*71)+140);//Asignamos los valores a una variable que vamos a añadir a la posición del array en la que estemos
                System.out.print(num[i][j] + " ");
                if(num[i][j] < min){
                    min = num[i][j];
                }
                if(num[i][j] > max){
                    max = num[i][j];
                }
                sumai = sumai + num [i][j];
                cont++;
            }
            System.out.print("|");
            System.out.print(" " + (sumai/cont) + " " + min + " " + max);
            System.out.println();
        }
    }
}
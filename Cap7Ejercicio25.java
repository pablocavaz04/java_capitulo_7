/**
 * Author: Pablo Camino Vázquez
 * 25) Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 */



public class Cap7Ejercicio25 {
    public static void main(String[] args)
        throws InterruptedException{
            int [] [] num = new int [4] [5]; // [i] [j]

            int numero = 0;
            int sumatot = 0;
            int numero2 = 0; 
            int sumai = 0;
            int sumaj = 0;
    
            for (int i = 0;i<4;i++){ //Creamos el array e introducimos los números en 
                for (int j = 0;j<5;j++){
                    numero = (int)(Math.random()*(900)+100);
                    num [i][j] = numero;
                }
            }
    
            for(int i = 0;i<4;i++){ //SUMAR FILAS
                sumai = 0;
                for (int j = 0;j<5;j++){
                    System.out.printf("%6d |",num [i][j]);
                    sumai = sumai + num [i][j];
                    Thread.sleep(100);
                }
                System.out.printf("|%6d\n",sumai);
                Thread.sleep(500);
            }
    
            for (int j = 0;j<5;j++){
                System.out.print("---------");
            }
            System.out.println("---------");
    
            for (int j = 0;j<5;j++){//SUMAR COLUMNAS
                sumaj = 0;
                for(int i = 0;i<4;i++){
                    sumaj = sumaj + num[i][j];
                }
                System.out.printf("%7d ",sumaj);
                Thread.sleep(500);
            }
    
            for(int i=0 ; i<4 ; i++){ //SUMA TOTAL DE LOS NÚMEROS QUE HAY
                for (int j = 0;j<5;j++){
                    numero2 = num [i][j];
                    sumatot = numero2+sumatot;
                }
            }
            System.out.printf("%7d",sumatot);
    } 
}
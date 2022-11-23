/*
 * Author:Pablo Camino Vázquez
 * 4) Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas.
 */
public class Cap7Ejercicio04 {
    public static void main(String[] args) {
        int [] numero = new int[20];
        for(int i=0;i<20;i++){
            numero [i] = (int)(Math.random()*101);
            System.out.print(numero[i]+" ");
        }
        
        int [] cuadrado = new int[20];
        for(int j=0;j<20;j++){
            cuadrado [j] = (numero[j])*(numero[j]);
            System.out.print(cuadrado[j]+" ");
        }

        int [] cubo = new int [20];
        for(int k=0;k<20;k++){
            cubo [k] = (numero[k])*(numero[k])*(numero[k]);
            System.out.println(cubo[k]+" ");
        }
    }
}

/**
 * Author: Pablo Camino Vázquez
 * 18) Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el 
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 */



public class Cap7Ejercicio18 {
    public static void main(String[] args) {
        int [] numeros = new int [10];
        int contmenor = 0;
        int contmayor = 0;
        
        System.out.println("El array inicial sería: "); //Mostramos el array sin modificar
        System.out.print("Índice");
        for(int i = 0; i <10 ; i++){
            System.out.printf("%7s" , i);
        }
        System.out.println("");
        for(int i = 0; i<10;i++){ //Creamos el array
            numeros [i] = (int)(Math.random()*201);
        }
        System.out.print("Valor ");
        for(int i = 0; i <numeros.length ; i++){
            System.out.printf("%7s" , numeros[i]);
        }

        System.out.println("");
        for(int i = 0;i<10;i++){ //Vemos cuantos números hay mayores y menores a 100
            if(numeros[i]<100){
                contmenor++;
            }else{
                contmayor++;
            }
        }

        int contmayores=0; //Para usarlo de índice en el array de mayores
        int contmenores=0; //Para usarlo de índice en el array de menores

        int [] menores = new int [contmenor]; //Crearemos los arrays
        int [] mayores = new int [contmayor];


        for(int i = 0;i<10;i++){ //Añadimos los valores a los arrays
            if(numeros[i]<=100){
                menores[contmenores] = numeros[i];
                contmenores++;
            }
        }
        for(int i = 0;i<10;i++){ //Añadimos los valores a los arrays
            if(numeros[i]>100){
                mayores[contmayores] = numeros[i];
                contmayores++;
            }
        }

        System.out.println("");
        System.out.println("El array modificado sería: "); //Mostramos el array array modificado
        System.out.print("Índice");
        for(int i = 0; i <10 ; i++){
            System.out.printf("%7s" , i);
        }
        System.out.println("");
        System.out.print("Valor ");
        for(int i = 0; i <10 ; i++){
            if(i<menores.length){
                System.out.printf("%7s",menores[i]);
            }

            if(i<mayores.length){
                System.out.printf("%7s",mayores[i]);
            }
        }
    }
}
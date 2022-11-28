/**
 * Author: Pablo Camino Vázquez
 * 15) Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
 * un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
 * como máximo e intente de nuevo”. Para el grupo que llega, se busca
 * siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
 * busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
 * dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
 * las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
 * programa se ilustra a continuación:
 */

import java.util.Scanner;

public class Cap7Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] mesas = new int [10]; //Creamos el array

        for(int i = 0; i < 9 ; i++){ //Asignamos los valores al array
            mesas [i] = (int)(Math.random()*5);
        }

        int numclientes = 0;

        while (numclientes>=0) { //Así lo repetiremos hasta que sea -1
                
            System.out.print("Mesa nº   "); //Mostramos el array con el número de mesas
            for(int i = 1; i<=10; i++){
                System.out.printf("%9s", i);
            }
            System.out.println("");
            System.out.print("Ocupación "); //Mostramos el array con el número de mesas
            for(int i = 0; i<10; i++){
                System.out.printf(" %8s", mesas[i]);
            }

            System.out.println("");
            System.out.print("Bienvenido al BarPepe, ¿Cuántos sois?, usa el -1 para salir: ");
            numclientes=sc.nextInt();
            if(numclientes<=-1){ //Si es -1 nos salimos
                System.out.print("Gracias, hasta pronto");
                break;
            }

            if(numclientes>4 || numclientes<=0){ //Si los valores no son válidos los pedimos de nuevo
                System.out.print("Por favor, dime bien el número de personas que sois: ");
                numclientes = sc.nextInt();
            }

            for(int i = 0;i<mesas.length ; i++){ //Recorremos el array entero para saber si el valor de alguno 0 o no para asignarle los nuevos clientes
                if(mesas[i] == 0){ //Si es 0 lo que hacemos es que vayan a esa mesa ddel tirón
                    System.out.println("Siéntense en la mesa: " + (i+1));
                    System.out.println("");
                    mesas[i] = numclientes;
                    break;
                }
                if(i==mesas.length-1){
                    for(int b = 0;b<mesas.length ; b++){
                        if(numclientes+mesas[b]<=4){ //Si cuando lo recorre entero no hay ninguno vacío, lo pondremos en donde haya hueco
                            System.out.println("Tendrán que compartir mesa, siéntense en la mesa: " + (b+1));
                            System.out.println("");
                            mesas[b] += numclientes;
                            break;
                        }
                        if(b==mesas.length-1){
                            System.out.println("Lo siento no hay hueco");
                            break;
                        }
                    }
                }
                
            }
        }
        sc.close();  
    }
}
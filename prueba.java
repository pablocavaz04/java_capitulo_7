import  java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] n = new int [5][5];
        for(int i = 0; i < 5; i++)
            for(int j = 0; j<5;j++)
                if(i==j)
                    n[i][j]=1;
                else
                    n[i][j]=0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5;j++)
                System.out.print(n[i][j]+", ");
            System.out.println();
        }
    } 
}
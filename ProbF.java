import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner bs = new Scanner(System.in);
        int c,d;
        int matriks [][] = new int[3][3];
        int transpose [][] = new int[3][3];
        Scanner asd = new Scanner(System.in);
        for(c = 0; c < 3; c++){
            for(d = 0; d<3; d++){
                matriks[c][d] = asd.nextInt();
            }
        }
        for(c = 0; c < 3; c++){
            for(d=0; d<3; d++){
                transpose[d][c] = matriks[c][d];
            }
        }
        for(c=0; c<3; c++){
            for (d=0;d<3;d++){
                System.out.print(transpose[c] [d] + " ");
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
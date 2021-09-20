import java.util.Scanner;

public class ProbC{
    public static void main(String[] args){
        Scanner bs = new Scanner(System.in);
        float A = bs.nextFloat();
        float B = bs.nextFloat();
        System.out.println("%.2f", (A*B)/2);
    }
}
import java.util.Scanner;

public class ProbC{
    public static void main(String[] args){
        Scanner bs = new Scanner(System.in);
        int bebek = bs.nextInt();
        int teman = bs.nextInt();
        int dapat = bebek/teman;
        int sisa = bebek%teman;
        System.out.println("masing-masing " + dapat);
        System.out.println("bersisa " + sisa)
    }
}
import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
        System.out.println("\nDivided by 3 are-");
        for(int i=1;i<=100;i++){
            if (i %3==0)
                System.out.println(i+" ,");
        }
        System.out.println("\nDivided by 5 are-");
        for (int i=1;i<=100;i++){
            if (i%5==0)
                System.out.println(i+" ,");
        }
        System.out.println("\n\nDivided by 3 & 5 are-");
        for (int i=0;i<=100;i++){
            if (i%3==0 && i%5==0)
                System.out.println(i+" ,");
        }
        System.out.println("\n");
    }
}

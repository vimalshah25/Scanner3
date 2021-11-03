import java. util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {

        int i, fact = 1;
        int num;
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n enter num :");
        num = scanner.nextInt();

        for (i=1;i<=num;i++){
            fact = fact*i;


        }
        System.out.println("\n factorial of "+num+"is"+fact);

    }

}

import  java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n, f1 = 0, f2 = 1, f3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = input.nextInt();
        System.out.println("Fibonacci series is:");
        if (n == 1) {
            System.out.println(f1);
        } else if (n == 2) {
            System.out.println(f1 +" "+f2);

        }
          else if (n > 2) {
            System.out.println(f1 + " " + f2 +"");
            for (int i = 3; i <= n; i++) ;

            {
                f3 = f1 + f2;
                System.out.println(f3 + " ");
                f1 = f2;
                f2 = f3;
            }
        }
                   else
                   {
                       System.out.println("Invalid input - Enter the value of N greater thatn 0" );
                   }

          }

    }


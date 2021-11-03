
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =obj.nextInt();
        int sum = 0;
        for ( ;  num > 0 ; num= num/10){
            int r = num % 10;
            sum = sum * 10 + r;

        }
        System.out.println(sum);

    }

}

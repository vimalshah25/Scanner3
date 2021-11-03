import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
    {
        System.out.println("Enter number to check prime or not ");
        Scanner scanner = new Scanner(System.in);
         int n =scanner.nextInt();
         boolean flag=false;
         for(int i=2;i<=n/2;i++){
             if(n%i==0){
                 flag=true;
             }
         }
         if(!flag)
             System.out.println("prime");
         else{
             System.out.println("non prime ");
         }

    }

}

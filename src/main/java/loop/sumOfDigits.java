package loop;
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //Variable declaration-
        int num ;
        int temp ;
        int sum=0 ;
        int rem ;
        // printing line  for providng input by user -
        System.out.println("Please input your digits that you want to do sum:");
        num= input.nextInt(); // taking input from user
        temp=num;

        // the main mathmatical technique in for loop-
        while(temp!=0){
            rem = temp % 10;
            sum=sum+rem;
            temp=temp/10 ;

        }
        // Printing line for summation
        System.out.println("The summation is : first digit+second digit+third digit");
        // showing the original out
        System.out.println(sum);

    }
}

package loop;
import java.util.Scanner;
//program for reverse a number using while loop
public class reverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input a number you want to reverse [as example- 256 ] : ");
        int number= input.nextInt();
        int reverse =0;

        while(number!=0){

            int rem=number%10;
            number=number/10;
            reverse=reverse*10+rem;

        }
        System.out.println("The reverse number is: " +reverse);
    }
}

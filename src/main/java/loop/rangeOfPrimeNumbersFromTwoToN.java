package loop;
import java.util.Scanner;
import static java.lang.Math.sqrt;
// program to show range of prime numbers from 2 to n using while loop where n is the number by user input
public class rangeOfPrimeNumbersFromTwoToN {
    public static void main(String[] args) {
        int begin =2;
        int num1 , cal ,  num2 ;
        int flag;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for n:");
         num1= input.nextInt();

        while(begin<=num1){

           num2= (int)sqrt(begin);

            cal=2;
            flag= 1;

            while(cal<=num2){

                if(begin%cal == 0)
                {
                    flag=0;
                    break;
                }
                cal++;
            }
            begin++;

            if(flag){
                System.out.println(begin);
                begin++;
            }

        }



    }
}

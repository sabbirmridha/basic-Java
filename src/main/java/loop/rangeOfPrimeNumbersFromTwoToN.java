package loop;
import java.util.Scanner;
import static java.lang.Math.sqrt;
// program to show range of prime numbers from 2 to n using while loop where n is the number by user input
public class rangeOfPrimeNumbersFromTwoToN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for n :");
        int num1= input.nextInt();
        int count =0;
        int k=2;

        while(k<=num1){
            boolean flag =true;
            for(int i=2;i<=k/2;i++){
                if(k%i==0){
                    flag=false;
                    break;
                }
            }

            if(flag==true){
                System.out.println(k);
                count++ ;
            }
            k++;

        }
        System.out.println("total prime numbers from 2 to  "+num1+"  is   "+count );







    }
}

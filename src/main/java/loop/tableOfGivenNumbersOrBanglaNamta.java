package loop;
/*Take a number as input from the user. Now write a program to show table of the given numbers. Output will be
shown like this:
10*1=10
10*2=20
10*3=20
----
*/
import java.util.Scanner;
public class tableOfGivenNumbersOrBanglaNamta {
    public static void main(String[] args) {
        System.out.println("Input a number to see the table :");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        for(int n=1;n<=10;n++){
            int mul=number*n;
            System.out.println(number+"*"+n+"="+mul);
        }
    }
}

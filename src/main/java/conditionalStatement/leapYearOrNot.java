package conditionalStatement;
import java.util.Scanner;
// Program for taking input from user as year & print if it is leap year or not .
public class leapYearOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the year you want to know if it is leap year or not: ");
        int year= input.nextInt();

        // Conditions For leap year-

        if(((year % 4==0)&&(year % 100!=0)) || (year%400==0) )
            System.out.println(year+  "is leap year");

        else{

            System.out.println(year+  "is not leap year");
        }






    }
}

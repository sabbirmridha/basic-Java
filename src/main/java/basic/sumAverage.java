package basic;

import java.util.Scanner;
// program for showing sum and average by taking 2 inputs/value from user
public class sumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variable declare
        int x , y , z, sum ;
        float avg ;

        System.out.println("Enter first number:"); // print line for taking input for first number
        x= input.nextInt(); // taking input of first number

        System.out.println("Enter second number:"); // print line for taking input for second number
        y= input.nextInt(); // taking input of second number

        System.out.println("Enter Third number:"); // print line for taking input for third number
        z= input.nextInt(); // // taking input of third number
        // summation
        sum = (x+y+z) ;

        //average
        avg = (sum/3) ;
        // Printing line for sum & average-
        System.out.println("Sum is :" +sum );
        System.out.println("Average is:" +avg);
    }
}

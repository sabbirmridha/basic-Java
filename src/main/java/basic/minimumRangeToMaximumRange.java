package basic;

import java.util.Scanner;
// program to generate random numbers from minimum range to maximum range by user input .
public class minimumRangeToMaximumRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //min range

        System.out.println("Provide value for min range: ");
        int min=input.nextInt();

        //max range

        System.out.println("Provide value for max range: ");
        int max=input.nextInt();

        double random_number=Math.random()*(max-min)+min;
        System.out.println((int) random_number);
    }
}

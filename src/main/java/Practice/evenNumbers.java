package Practice;

import java.util.Scanner;

// Even numbers & odd numbers printing from  0 to 10
public class evenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers from 0 to 10:  "   );
        for ( int num=0; num<=10;num=num+2) {
            System.out.println(num);
        }

        System.out.println("ODD numbers from 0 to 10:  "   );
        for ( int num=1; num<=10;num=num+2) {
            System.out.println(num);
        }

    }
}

package conditionalStatement;
import java.util.Scanner;
// Program for calculate cgpa & find grade from 4 subjects.
public class cgpaGradeCalculation {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);



        for(int i=0;i<4;i++) {
            System.out.println("Enter your marks for 4 subjects  to know your grade between 50 to 100: -");

            int marks = input.nextInt();


            //conditions for grade calculation:


            if (marks >= 94 && marks < 101) {
                System.out.println("A+ : 4");
            } else if (marks >= 90 && marks < 94) {
                System.out.println("A : 3.75 ");
            } else if (marks >= 86 && marks < 90) {
                System.out.println("A- :3.5");
            } else if (marks >= 82 && marks < 86) {
                System.out.println("B+ :3.25");
            } else if (marks >= 78 && marks < 82) {
                System.out.println("B :3");
            } else if (marks >= 74 && marks < 78) {
                System.out.println("B- :2.75");
            } else if (marks >= 70 && marks < 74) {
                System.out.println("C+ :2.5");
            } else if (marks >= 66 && marks < 70) {
                System.out.println("C :2.25");
            } else if (marks >= 62 && marks < 66) {
                System.out.println("C :2");
            } else if (marks >= 58 && marks < 62) {
                System.out.println("D+ :1.75");
            } else if (marks >= 54 && marks < 58) {
                System.out.println("D :1.5");
            }
            else if(marks >= 50 && marks < 54) {
                System.out.println("D- :1");

            }
            else {
                System.out.println("F : 0.00");

            }


            System.out.println("Your grade is:" + marks);


        }







    }
}

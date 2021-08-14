package basic;
import java .util .Scanner ;
// Program to solve (a+b)^2  by taking input a & b from user
public class aPlusBHoleSquareFormula {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input number a :");
        int a = input.nextInt();

        System.out.println("input number b :");
        int b= input.nextInt();

        //simplification of the formula for calculation purpose
        double x =Math.pow(a, 2);
        double y =Math.pow(b, 2);
        double z =2*(a*b);

        System.out.println("(a+b)^2 :");
        System.out.println(x+z+y);
    }
}

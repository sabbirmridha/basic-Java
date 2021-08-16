package Practice;
// positive negative number check-
import java.util.Scanner ;
public class positiveNegetiveNumberCheck {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Provide input a number to check negative or positive numbers:");
        int var = input.nextInt();
        // if else Conditions to check positive & negative numbers-
        if(var>=0){
            System.out.println(var + "is positive"); // printing line for positive
        }
        else{
            System.out.println(var+"is negative"); // printing line for negative
        }
    }
}

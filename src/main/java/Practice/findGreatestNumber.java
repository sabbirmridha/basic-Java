package Practice;
import java.util.Scanner;
// Greatest number print among 3 value
public class findGreatestNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("input for First Number:");
        int var1= input.nextInt();

        System.out.println("input for second Number:");
        int var2= input.nextInt();

        System.out.println("input for third Number:");
        int var3= input.nextInt();

        //Conditions for checking the greatest numbers-

        if(var1>var2 && var1>var3){
            System.out.println(var1+"is greatest number");
        }
        else if(var2>var1 && var2>var3){
            System.out.println(var2+"is greatest number");
        }
        else if(var3>var1 && var3>var2){
            System.out.println(var3+"is greatest number");
        }
        else{
            System.out.println("Please don not provide duplicate number");
        }


    }
}

package Practice;
import java.util.Scanner;
//Program for capital or small letter finding-
public class smallOrCapitalLetter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please provide  the desired letter you want to know is it capital or small");
        char ch = input.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println(ch+" is capital letter");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(ch+" is small letter");
        }
        else{
            System.out.println("Wrong input");
        }

    }
}


package Practice;
import java.util.Scanner;
//TO check if the provided UserName & Password are valid during login.
public class infoCorrectDuringLogin {
    public static void main(String[] args) {
        // as there is no database here we will keep the desired username & password in a variable
        String _username="Sabbir";
        String _password="1970";
        Scanner input =new Scanner(System.in);

        System.out.println("Please  Provide User Name:");
        String username= input.next(); // Taking user name from user

        System.out.println("Please Provide Password:");
        String password= input.next(); //Taking Password from user

        if((username.contentEquals(_username) && password.contentEquals(_password))){
            System.out.println("Login Attempt Successful!");

        }
        else{
            System.out.println("Login Attempt Failed.Please try again with correct information!");
        }


    }
}

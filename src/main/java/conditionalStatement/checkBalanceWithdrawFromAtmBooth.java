package conditionalStatement;
import java.util.Scanner;
/*Write a program to check balance and withdraw money from ATM booth using switch case and if else (1. Check
balance 2. Withdraw Money)
Notes:
1. If user inputs wrong PIN more than 3 times, following error should be shown: "You have entered wrong PIN more
than 3 times. Card has blocked."
2. If user inputs an amount that is not divisible by 500, then system should throw an error message as "Balance is not
divisible by 500. Please try with another amount" and takes the valid input again
3. If user inputs more than balance, then system should throw an error message as "Not enough balance. Please input
valid amount" and takes the valid input again*/
public class checkBalanceWithdrawFromAtmBooth {
    public static void main(String[] args) {
        int pinstored =5678;
        double balance = 10000;
        System.out.println("Select from Option:");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Balance");

        Scanner input = new Scanner(System.in);
        int select = input.nextInt();

        switch (select){
            case 1:
                int attempt =0;
                for (int i=1;i<=3;i++)
                {
                    System.out.println("Enter your PIN");
                    int pin = input.nextInt();
                    if(pinstored==pin){

                        System.out.println("Balance is  "+balance +"tk");
                        break;
                    }
                    else{
                        System.out.println("Wrong pin inserted");
                    }
                    attempt++ ;

                }
                if(attempt>=3){

                    System.out.println("You have enter wrong pin more than 3 times. Card has blocked");

                }
                break;

            case 2:
                attempt=0;
                for(int i=0;i<=3;i++) {
                    System.out.println("Enter your PIN");
                    int pin = input.nextInt();
                    if (pinstored == pin) {
                        System.out.println("Input amount that multiply by 500");
                        int amount = input.nextInt();
                        if (amount <= balance && amount % 500 == 0) {
                            balance -= amount;
                            System.out.println("Withdraw successful. Your current balance is " + balance + " Tk");
                            break;
                        } else if (amount > balance) {
                            System.out.println("Not enough balance. Please input valid amount");
                        } else {
                            System.out.println("Balance is not multiply by 500. Please try with another amount");
                        }
                    } else if (pinstored != pin) {
                        System.out.println("Wrong PIN inserted");
                    } else if (attempt >= 3) {
                        System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                    }
                    attempt++;

                }

                if (attempt >= 3) {
                    System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                }
                break;
            default:
                   System.out.println("Please select option either 1 or 2");

        }

    }
}

package string_loop;
import java.util.Scanner;
/*
 A program to make a digital tasbih where the program counts each time user press enter until press 0
*/

public class digitalTasbihProgram {
    public static void main(String[] args) {
        System.out.println("Press enter to start your zikir: \nPress 0 and hit enter for quit");
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (true) {
            String readLine = input.nextLine();
            count++;
            if (readLine.equals("0")) {
                break;
            }
            System.out.print(count);
        }
    }
}




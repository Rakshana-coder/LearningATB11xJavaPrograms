package ex_09_Switch;
import java.util.Scanner;
public class Lab065_Switch_WO_Break {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the day: (1 to 7)");
        int day = Scanner.nextInt();

            switch (day) {

                case 1:
                    System.out.println("Mon");
                case 2:
                    System.out.println("Tue");
                case 3:
                    System.out.println("Wed");
                case 4:
                    System.out.println("Thur");
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Sat");
                case 7:
                    System.out.println("Sun");
                default:
                    System.out.println("Invalid, day number");
        }

    }
}

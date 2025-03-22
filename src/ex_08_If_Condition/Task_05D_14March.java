package ex_08_If_Condition;

import java.util.Scanner;

public class Task_05D_14March {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check odd or even: ");
        int Num=scanner.nextInt();
        if (Num%2==0)
        {
            System.out.println("The number " + Num + " is Even.");
            //out put The number 2 is Even.
        }
        else
            System.out.println("The number " + Num + " is odd.");
    }
}

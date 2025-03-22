package ex_08_If_Condition;

public class Task_05_14March {
    public static void main(String[] args) {

        //Create a Program - Take user input & Check weather the input is even or odd number

        int num = Integer.parseInt(args[0]);
        if (num%2!=0)
        {
            System.out.println("The entered number is Odd");
        }
        else
        {
            System.out.println("The entered number is Even");
        }
    }
}

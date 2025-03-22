package ex_08_If_Condition;

public class Task_03_14March {
    public static void main(String[] args) {

        //CLI Options
        /*Take a user input 2 numbers from the arguments and calculate the maximum
        in between with ternary operator */

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int z = x > y ? x : y; //Ternary Operator
        System.out.println(z);
    }
}

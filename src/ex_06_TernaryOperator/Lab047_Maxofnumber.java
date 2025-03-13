package ex_06_TernaryOperator;

public class Lab047_Maxofnumber {
    public static void main(String[] args) {

        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));  //Math function

        int max = x > y ? x : y; //Ternary Operator
        System.out.println(max);
    }
}

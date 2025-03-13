package ex_06_TernaryOperator;

public class Lab046_IQ {
    public static void main(String[] args) {

        //Ternary operator --> Syntax - Condition? Expression 1 : Expression 2

        /*Nested Ternary -->
        Syntax - Condition1 ? Expression 1 : (Condition 2 ? Expression 2 : Expression 3)
         */
        int number = 10;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20") : "B";
        System.out.println(result);

        int number1 = 15;
        String result1 = (number1 > 10) ? (number1 > 20 ? "N>20" : "N<20") : "B";
        System.out.println(result1);



    }
}

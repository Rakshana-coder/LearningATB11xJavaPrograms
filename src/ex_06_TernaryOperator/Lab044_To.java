package ex_06_TernaryOperator;

public class Lab044_To {
    public static void main(String[] args) {

        int age = 10;
        String canIVote  =  10 >=18 ? "Yes, You can Vote" : "No You can't Vote";
        System.out.println(canIVote);

        int age1 = 18;
        String canIVote1  =  18 >=18 ? "Yes, You can Vote" : "No You can't Vote";
        System.out.println(canIVote1);

        int age2 = 21;
        String canIVote2  =  21 >=18 ? "Yes, You can Vote" : "No You can't Vote";
        System.out.println(canIVote2);

        /*Ternary Operator
        Syntax - Condition? Expression 1 : Expression 2
        If condition is true then Expression 1 will be displayed
        If condition is false then Expression 2 will be displayed
         */
    }
}

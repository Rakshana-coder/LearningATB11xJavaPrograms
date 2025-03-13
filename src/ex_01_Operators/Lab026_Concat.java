package ex_01_Operators;

public class Lab026_Concat {
    public static void main(String[] args) {

        String first_name = "Good";
        String last_name = "Morning";

        int a = 70;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // GoodMorning7010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub

    }
}

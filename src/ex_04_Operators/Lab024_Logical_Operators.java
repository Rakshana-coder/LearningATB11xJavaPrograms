package ex_04_Operators;

public class Lab024_Logical_Operators {

    public static void main(String[] args) {

        boolean a1 = true;
        boolean b2 = false;

        System.out.println(a1 && b2);

        /*In summary, the AND gate outputs 1 only when both inputs are 1,
        while the OR gate outputs 1 when at least one input is 1
         */

        System.out.println(b2 || a1);

        System.out.println(!b2);


    }
}

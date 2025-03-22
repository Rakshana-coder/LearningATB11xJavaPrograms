package ex_07_Increment_Decrement_Operator;

public class Lab059_De {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a-- - --a);
        System.out.println(a);

        //a-- = A -> ExpA = 10, 9
        //--a = B -> ExpB = 8, 8
        //ExpA - ExpB = 10 - 8 = 2, 8
    }
}

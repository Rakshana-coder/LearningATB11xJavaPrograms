package ex_07_Increment_Decrement_Operator;

public class Lab060_De_P2 {
    public static void main(String[] args) {

        int a = 30;
        System.out.println(--a - --a);
        System.out.println(a);


        //--a = A -> ExpA = 29, 29
        //--a = B -> ExpB = 28, 28
        //ExpA - ExpB = 29 - 28 = 1, 28

        //Note - Below is the other decrement program

        //int a= 30;
        //int result = --a; // 9
        //System.out.println(result);
        //System.out.println(a); // 9
    }
}

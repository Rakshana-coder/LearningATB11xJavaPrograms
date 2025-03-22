package ex_07_Increment_Decrement_Operator;

public class Lab055_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        //Expression and Result Table
        //Line no | a | Exp
        //5 | 10 | NA
        //6 | 11 | 10 (Value of a will be incremented but b value will be assigned first)
        //7 | 11 | NA
        //8 | NA | 10

    }
}

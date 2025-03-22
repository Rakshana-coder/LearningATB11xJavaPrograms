package ex_07_Increment_Decrement_Operator;

public class Lab058_Exp2 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        //A = ++a, B = ++a
        //ExpA -> ++a = 11, a = 11
        //Exp2 -> ++a = 12, a = 12
        //ExpA + ExpB = 11+12 = 23, a = 12 (Latest)
    }
}


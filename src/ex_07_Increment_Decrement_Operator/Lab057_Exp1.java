package ex_07_Increment_Decrement_Operator;

public class Lab057_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        //A = a++
        //B = ++a
        //ExpA + ExpB
        //a++ -> A -> ExpA = 10 , a = 11,
        //++a -> B -> ExpB = 12 , a = 12
        //A+B -> ExpA + ExpB -> 10+12 , a = 12

        //Line no | a| Exp
        //5 | 10| NA
        //6 | 11 | 10
    }
}

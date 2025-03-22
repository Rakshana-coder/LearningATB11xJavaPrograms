package ex_08_If_Condition;

public class Task_04_14March {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        /* --a = ExpA = 19, 19, 19
           a++ = ExpB = 19, 20,
           a-- = ExpC = 18, 17, 17
           ExpA + ExpB + ExpC = 19 + 19+ 18 = 56
         */
    }
}

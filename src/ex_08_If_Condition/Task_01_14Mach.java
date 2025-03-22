package ex_08_If_Condition;

public class Task_01_14Mach {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        /*
        ++a = A -> ExpA = 11, 11, 11
        a++ = B -> ExpB = 11, 11, 12
        a++ = C -> ExpC = 12, 13, 13
        ExpA + ExpB + ExpC = 11 + 11+ 12 = 34
        */
    }
}


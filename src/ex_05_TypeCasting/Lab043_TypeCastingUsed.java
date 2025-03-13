package ex_05_TypeCasting;

public class Lab043_TypeCastingUsed {
    public static void main(String[] args) {

        int a = 100;
        float f = 18.45f;
//        int i = a+f; // Narrow - Implicit not allowed in Java
        int i1 = a+(int)f; // Narrow - Explict
        System.out.println(i1);

        float f1 = a+f; // Widening - auto - implicit
        float f2 = (float) a+f; // Widening  - Explicit
        System.out.println(f1);
        System.out.println(f2);

    }
}

package ex_05_TypeCasting;

public class Lab040_TypeCasting1 {
    public static void main(String[] args) {

        byte b = 10;
        int a = b; // Valid - > Implicit Casting- Automatically
        int a1 = (int) b; // Explicit Casting - Widening( doesn't require)

        System.out.println(a1);

        //Int to double --> Implicit --> Widening Casting
        int i = 30;
        double d = i;
        System.out.println(d);

        //Int to double --> Explicit --> Widening Casting
        int i1 = 50;
        double d1 = (double)i;
        System.out.println(d1);



    }
}

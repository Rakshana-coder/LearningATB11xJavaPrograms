package ex_01_Java_Basics_Part2;

public class Lab014_printf {
    public static void main(String[] args) {

        int a = 10;
        //System.out.printf("Your variable is %d", a);

        //Note - printf is used for formatting
        //%d -> int, byte, long, short --> Data types
        // %s -> String
        //%f -> float, double
        //%b -> Boolean

        int b = 50;

        System.out.printf("%d + %d",a,b);

    }
}

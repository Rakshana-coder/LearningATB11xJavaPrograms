package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab122_StringBuilder_VS_StringBuffer {
    public static void main(String[] args) {

        //90% the normal string is used
        String S1 = "Monday";
        String S2 = new String("Monday");

        //Less than 10%
        StringBuilder StringBuilder = new StringBuilder("Tuesday");
        StringBuffer  StringBuffer= new StringBuffer("Wednesday");

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(StringBuilder);
        System.out.println(StringBuffer);
    }
}

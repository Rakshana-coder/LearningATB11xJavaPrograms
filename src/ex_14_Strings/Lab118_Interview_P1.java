package ex_14_Strings;

public class Lab118_Interview_P1 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello";
        //All 3 will be stored in String Constant Pool and there will be only 1 Hello as no duplicates will be stored (SCP)

        String S4 = new String("Hello");
        String S5 = new String("Hello");
        String S6 = new String("Hello"); //All 3 will be stored in Object Area as separate object (OA)
    }
}

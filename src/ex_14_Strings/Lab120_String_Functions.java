package ex_14_Strings;

public class Lab120_String_Functions {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); //TRUE
        System.out.println(str1 == str3); //False
        System.out.println(str1.equals(str3)); //True
    }
}

package ex_05_TypeCasting;

public class Lab042_TypeCasting {
    public static void main(String[] args) {

        long phone_no = 9876543210l;

        //short s = phone_no --> Not possible as Implicit Narrowing is not allowed in Java

        short s = (short) phone_no;
        System.out.println(s);


    }
}

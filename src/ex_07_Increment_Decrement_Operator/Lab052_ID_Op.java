package ex_07_Increment_Decrement_Operator;

public class Lab052_ID_Op {
    public static void main(String[] args) {

        //Pre Increment - Increment first and then assign the value
        float a = 120.12f;
        float b = ++a; //Increment first and then assign the value
        System.out.println(b); //15
        System.out.println(a); //16

        //Other way

        //Exp and Result Table
        //Line no | a | Result b
        //6 | 15 | NA (we are not printing b in 6th Line)
        //7 | NA | 16
        //8 | 16 (NA) | 16
        //9 | 16 | 16 (NA)

    }
}

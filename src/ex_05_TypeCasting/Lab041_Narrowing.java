package ex_05_TypeCasting;

public class Lab041_Narrowing {
    public static void main(String[] args) {

        float a  = 500.0f;
        //byte b = a; // Invalid - Narrowing - Implicit Casting is not allowed.

        byte b = (byte) a; // Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.

        System.out.println(b);

        int val  = 300;
        byte b2 = (byte)val;
        System.out.println(b2);

        /* Search for binary number of 300
        Then take only 8bits from LH and
        Search for integer value for that 8 bits value
         */
    }
}

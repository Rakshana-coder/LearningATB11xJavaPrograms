package ex_07_Increment_Decrement_Operator;

public class Lab051_In_Op_De {

    public static void main(String[] args) {

        // Take inputs
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);

        /*Note 1 - Run the above lines so that empty configuration will be created
        Then select the current file and click on Edit configuration and add the value
        so that the same value will be printed as result.
        */
        //Note 2 - Multiple values can be parsed as the inputs.

        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];
        String a4 = args[4]; /* java.lang.ArrayIndexOutOfBoundsException. Bcz
        only 4 values have been given as Inputs args(0, 1, 2, 3)
        */

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}

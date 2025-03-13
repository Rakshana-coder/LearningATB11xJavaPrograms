package ex_03_Literals;

public class Lab018_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+, blankspace

        //char c2 = "A"; // this is not a char, it is string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Hello"+new_line+"World");
        System.out.println("Hello"+tab_line+"World");
        System.out.println("Hello"+back_space+"World");
        System.out.println("Hello"+carriage_return+"World");

        System.out.println("Today is"+new_line+"Wednesday");
        System.out.println("Today is\nWednesday");

        System.out.println("Today is\rWednesday");

        char c19 = 'A';
        //ASCII value of A is 65

        char rupees = '₹';
        System.out.println("ruppes");

    }
}

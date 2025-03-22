package ex_09_Switch;

public class Lab073_JDK13 {
    public static void main(String[] args) {

        int itemCode = 007;
        switch (itemCode) {
            case 001, 002, 003:
                System.out.println("All of them are Electronic Gadgets");
                break;

            case 004, 005, 006:
                System.out.println("This is Mech");
                break;

            default:
                System.out.println("None");
        }

    }
}

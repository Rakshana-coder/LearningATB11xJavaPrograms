package ex_08_If_Condition;

public class Lab062_If_P1 {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("Allowed to go to GOA");
        }
        else {
            System.out.println("Not allowed to go to GOA");
        }
    }
}

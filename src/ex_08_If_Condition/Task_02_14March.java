package ex_08_If_Condition;

public class Task_02_14March {
    public static void main(String[] args) {

        //CLI Options
        //Take a user input - Name, Age and Salary and print them in the end.

        System.out.println("Please enter the name, age and salary");
        String name = (args[0]);
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}

package ex_16_Arrays;
import java.util.Scanner;
public class Lab142_Multiplication_Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print((i*j) + "|");
            }
            System.out.println();
        }
    }
}

package ex_16_Arrays;

import java.util.Arrays;

public class Lab135_IQ_Second_high_number_Array {
    public static void main(String[] args) {

        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);
        System.out.println(numbers[numbers.length-1]);
    }
}

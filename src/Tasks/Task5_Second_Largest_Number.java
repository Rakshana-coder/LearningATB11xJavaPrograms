package Tasks;

public class Task5_Second_Largest_Number {
    public static void main(String[] args) {

        int[] number={45, 23, 87, 12, 98, 10};
        int max=0;
        int seMax=0;
        for (int i=0;i<number.length;i++){
            if(number[i]>max)
            {
                seMax=max;
                max=number[i];
            }
            else if (number[i]>seMax && number[i]!=max) {
                seMax=number[i];

            }
        }
        System.out.println("First largest number is: "+max);
        System.out.println("Second largest number is: "+seMax);
    }
}

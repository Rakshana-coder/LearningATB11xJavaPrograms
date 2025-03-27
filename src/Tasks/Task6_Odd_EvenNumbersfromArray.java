package Tasks;

public class Task6_Odd_EvenNumbersfromArray {

    public static void main(String[] args) {

        int[] num = {0,1,2,3,4,5,6,7,8,9,10};
        for(int i : num)
        {
            if(i%2 == 0)
            {
                System.out.println(i + "Is an Even number");
            }
            else
            {
                System.out.println(i + "Is an odd number");
            }

        }
        }
    }


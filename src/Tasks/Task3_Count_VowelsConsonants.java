package Tasks;

import java.util.Scanner;

public class Task3_Count_VowelsConsonants {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scan.nextLine();
        int Vowels=0;
        int Consonants=0;

        for (int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if  (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                Vowels++;
            }
            else
            {
                Consonants++;
            }

        }
        System.out.println("The number of vowels are:" + Vowels);
        System.out.println("The number of Consonants are:" + Consonants);
    }
}

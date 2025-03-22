package ex_09_Switch;
import java.util.Scanner;
public class Lab066_Real_Switch_Automation {
    public static void main(String[] args) {

        //Web Automation
        //I will ask the user to give me the input from browser which he wants to
        //use to I will start the automation in that browser.
        /* String browser  = args[0];
        System.out.println(browser);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = scanner.next();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println(".....");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "Firefox":
                System.out.println("Starting the Firefox");
                break;

            case "IE":
                System.out.println("Starting IE");
                break;

            default:
                System.out.println("I have no idea which browser you are looking for: ");
                break;

                //Scanner close()
        }
        }
    }


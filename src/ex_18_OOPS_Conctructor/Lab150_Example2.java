package ex_18_OOPS_Conctructor;

public class Lab150_Example2 {
    public static void main(String[] args) {

        WebAutomation w1 = new WebAutomation();
    }
}
class WebAutomation{
    // DC
    WebAutomation(){
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("Y0u can do anything which you want to do, when Object is created.");
//        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}

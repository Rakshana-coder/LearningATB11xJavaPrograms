package ex_18_OOPS_Conctructor;

public class Lab149_OOPS_Constructor {
    public static void main(String[] args) {

        Baby b1 = new Baby(); //new Baby() is the Object Creation
        new Baby(); //new Baby() is the Object Creation - 2nd Object creation
        //So two times the Default constructor is called
        Baby b2; //Only Object reference
    }
}
class Baby{
    // Attribute | Instance Variable |  Member variables, data members
    String name;
    // Behaviour
    void cry(){
        System.out.println("Cry!!");
    }
    void sleep(){
        System.out.println("Cry!!");
    }
    void eat(){
        System.out.println("Eat!!");
    }
    // Default Constructor!
    Baby(){
        System.out.println("I am called, Default Constructor!");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)
    }
}

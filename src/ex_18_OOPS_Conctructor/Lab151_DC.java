package ex_18_OOPS_Conctructor;

public class Lab151_DC {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{
    A(){
        System.out.println("DC");
        /*Default Constructor will be created by Java by default even if we don't create.
        But it won't return anything as there will be nothing to print.
        If we add the print statement then it will print.
         */
    }
}

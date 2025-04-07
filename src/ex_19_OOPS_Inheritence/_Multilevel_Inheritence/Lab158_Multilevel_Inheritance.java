package ex_19_OOPS_Inheritence._Multilevel_Inheritence;

public class Lab158_Multilevel_Inheritance {
    public static void main(String[] args) {

        Grandfather gf = new Grandfather();
        gf.gf();

        System.out.println(" -- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println(" -- ");

        Son s1 = new Son();
        s1.gf();
        s1.f();
        s1.s();

    }
}

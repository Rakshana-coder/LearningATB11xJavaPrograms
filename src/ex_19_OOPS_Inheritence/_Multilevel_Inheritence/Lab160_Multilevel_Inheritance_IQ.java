package ex_19_OOPS_Inheritence._Multilevel_Inheritence;

public class Lab160_Multilevel_Inheritance_IQ {
    public static void main(String[] args) {

        //Son s1 = new GrandFather();
        //Son s1 = new Father();

        Son amit = new Son();
        amit.s();
        amit.f();
        amit.gf();
        System.out.println(amit.gold_gf);

        Father f1 = new Father();
        f1.home();

        Grandfather gf1 = new Grandfather();
        gf1.home();

        Grandfather grandFather = new Son();
        grandFather.home();
    }
}

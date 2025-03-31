package ex_17_OOPS;

public class Person2 {
    public static void main(String[] args) {
        System.out.println("Bye");
    }
}


class P1 {
}

class P2 {
}

//class 123{}
class $123 {
} //possible

class _123 {
} //possible

//class a b {} // Not possible
class P3 {
}
//class P3{} //Duplicate class is not possible

class P4 {
}; //possible

class P5 {

    class P6 {
        class P7 {
            class P8 {

            }
        }
    }

}

//Interview Question - Class within class is possible
class P8{
    public static void main(String[] args) {
        System.out.println("P8");
    }
}
}

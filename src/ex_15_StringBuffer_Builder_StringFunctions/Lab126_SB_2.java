package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab126_SB_2 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Monday");
        sb.append("Blues");
        System.out.println(sb);
        sb.delete(3,5);
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb);
    }
}

package test01;

public class demo02 {
    public static void main(String[] args) {
        demo01 d = new demo01("Li",10);
        demo01 d2 = new demo01("Li",10);
        System.out.println(d);
        boolean rest = d.equals(d2);
        System.out.println(rest);
    }
}

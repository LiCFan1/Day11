package Demo03;

import java.util.Calendar;

public class test04 {
    public static void method(int num, Calcable c){
        System.out.println(c.calc(num));
    }

    public static void main(String[] args) {
        int num = -10;
        method(num,Math::abs);
    }
}

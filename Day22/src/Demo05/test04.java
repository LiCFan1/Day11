package Demo05;

import java.util.function.Predicate;

// Predicate --- negate
public class test04 {
    public static Boolean method(String str, Predicate<String> prep){
        return prep.negate().test(str);
    }

    public static void main(String[] args) {
        String name = "LiChaoFan";
        Boolean rest = method(name, str -> str.length() >= 5);
        System.out.println(rest);
    }
}

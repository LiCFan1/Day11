package Demo05;

import java.util.function.Predicate;

// Predicate --> and
public class test02 {
    public static Boolean method(String str, Predicate<String> a,Predicate<String> b){
        return a.and(b).test(str);
    }

    public static void main(String[] args) {
        String name = "LiChaoFan";
        Boolean rest = method(name,str -> str.length() >= 5,str -> str.contains("F"));
        System.out.println(rest);
    }
}

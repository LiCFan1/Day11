package Demo05;

import java.util.function.Predicate;

// Predicate --> or
public class test03 {
    public static Boolean method(String str, Predicate<String> a,Predicate<String> b){

        return a.or(b).test(str);
    }

    public static void main(String[] args) {
        String name = "LiChaoFan";
        Boolean rest = method(name,str -> str.length() >= 5,str -> str.contains("z"));
        System.out.println(rest);
    }
}

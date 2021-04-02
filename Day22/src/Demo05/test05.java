package Demo05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class test05 {
    public static List<String> method(String[] s,Predicate<String> name,Predicate<String> gender){
        List<String> rest = new ArrayList<>();
        for (String str : s) {
            boolean b = name.and(gender).test(str);
            if(b){
                rest.add(str);
            }
        }
        return rest;
    }

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> r = method(array,str -> str.split(",")[0].length()>=4,
                str -> "女".equals(str.split(",")[1]));
        System.out.println(r);
    }
}

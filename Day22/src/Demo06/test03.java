package Demo06;

import java.util.function.Function;

public class test03 {
    public static void main(String[] args) {
        String name = "赵丽颖,20";
        int rest = method(name,str -> str.split(",")[1],
                str -> Integer.parseInt(str),
                num -> num+10);
        System.out.println(rest);
    }

    public static int method(String str, Function<String,String> one,
                             Function<String,Integer> two,
                             Function<Integer,Integer> three){
        return one.andThen(two).andThen(three).apply(str);
    }
}

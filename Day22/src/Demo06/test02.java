package Demo06;

import java.util.function.Function;

public class test02 {
    public static int method(String str, Function<String,Integer> f1,Function<Integer,Integer> f2){
        int rest = f1.andThen(f2).apply(str);
        return rest + 10;
    }

    public static void main(String[] args) {
        String num = "30";
        int rest = method(num,str -> Integer.parseInt(str)+20, n -> n*20);
        System.out.println(rest);
    }
}

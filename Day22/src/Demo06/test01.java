package Demo06;

import java.util.function.Function;

// Function -- apply
public class test01 {
    public static int method(String str, Function<String,Integer> func){
        int rest = func.apply(str);
        return rest;
    }

    public static void main(String[] args) {
        String num = "30";
        int rest = method(num, str -> Integer.parseInt(num)+10);
        System.out.println(rest);
    }
}

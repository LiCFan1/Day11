package Demo04;

import java.util.function.Consumer;

// Consumer-- andThen
public class test02 {
    public static void method(String str, Consumer<String> one,Consumer<String> two){
        one.andThen(two).accept(str);
    }

    public static void main(String[] args) {
        String name = "Li";
        method(name,(n1) -> System.out.println(n1.toLowerCase()),(n2) -> System.out.println(n2.toUpperCase()));
    }
}

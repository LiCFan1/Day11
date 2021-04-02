package Demo04;

import java.util.function.Consumer;

// Consumer-- void accept(T t)
public class test01 {
    public static void method(String str, Consumer<String> con){
        con.accept(str);
    }

    public static void main(String[] args) {
        String name = "Li";
        method(name,n -> System.out.println(n));
    }
}

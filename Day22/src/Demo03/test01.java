package Demo03;

import java.util.function.Supplier;

public class test01 {
    public static String method(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String str = "Li";
        String rest = method(() -> "Fan");
        System.out.println(rest);
    }
}

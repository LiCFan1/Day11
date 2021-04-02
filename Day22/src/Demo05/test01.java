package Demo05;


import javafx.beans.property.Property;

import java.util.function.Predicate;

// Predicate -- test
public class test01 {
    public static void method(String str,Predicate<String> pred){
        boolean b = pred.test(str);
        System.out.println(b);
    }

    public static void main(String[] args) {
        String name = "LiChaoFan";
        method(name, n -> n.length()>=5);
    }
}

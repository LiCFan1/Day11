package Demo04;

import java.util.function.Consumer;

// 练习
public class test03 {
    public static void method(String[] str, Consumer<String> one, Consumer<String> two){
        for (String s : str) {
            one.andThen(two).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
        method(array,s -> System.out.print("姓名："+s.split(",")[0]),
                s -> System.out.println("。性别："+s.split(",")[1]));
    }
}

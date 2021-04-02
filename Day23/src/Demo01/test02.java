package Demo01;

import java.util.ArrayList;
import java.util.List;

public class test02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream().forEach((s)-> System.out.println(s));
    }
}

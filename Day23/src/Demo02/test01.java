package Demo02;

import java.util.stream.Stream;

public class test01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Li", "Chao", "Fan");
        stream.forEach(name -> System.out.println(name));
    }
}

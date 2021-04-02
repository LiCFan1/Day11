package Demo02;

import java.util.stream.Stream;

public class test02 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Li", "Chao", "Fan");
        stream.filter(name -> name.length()>=3)
                .forEach(name -> System.out.println(name));
    }
}

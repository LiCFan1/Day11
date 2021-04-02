package Demo01;

import java.util.stream.Stream;

public class test05 {
    public static void main(String[] args) {
        String[] str = {"Li", "Chao", "Fan"};
        Stream<String> str1 = Stream.of(str);
        Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5);
    }
}

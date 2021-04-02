package Demo02;

import java.util.stream.Stream;

public class test06 {
    public static void main(String[] args) {
        String[] name = {"Li","Chao","Fan"};
        String[] s1 = {"你好","Java"};
        Stream<String> concat = Stream.concat(Stream.of(name), Stream.of(s1));
        concat.forEach(n -> System.out.println(n));
    }
}

package Demo02;

import java.util.stream.Stream;

public class test04 {
    public static void main(String[] args) {
        String[] name = {"Li","Chao","Fan"};
        long n = Stream.of(name).filter(s -> s.length() >= 3)
                .count();
        System.out.println(n);
    }
}

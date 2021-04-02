package Demo02;

import java.util.stream.Stream;

public class test05 {
    public static void main(String[] args) {
        String[] name = {"Li","Chao","Fan"};
        Stream.of(name).skip(1).forEach(n-> System.out.println(n));
    }
}

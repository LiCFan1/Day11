package Demo02;

import java.util.stream.Stream;

public class test03 {
    public static void main(String[] args) {
        String[] nums = {"10","20","30"};
        Stream<String> stream = Stream.of(nums);
        stream.map( n -> Integer.parseInt(n)).forEach(n -> System.out.println(n+10));
    }
}

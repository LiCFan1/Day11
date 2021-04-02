package Demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class test04 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Stream<String> s1 = map.keySet().stream();
        Stream<Integer> s2 = map.values().stream();
        Stream<Map.Entry<String, Integer>> s3 = map.entrySet().stream();
    }
}

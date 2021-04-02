package Demo01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class test03 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        Stream<Integer> s1 = l1.stream();

        Set<String> set = new HashSet<>();
        Stream<String> s2 = set.stream();
    }
}

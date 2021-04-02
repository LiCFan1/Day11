package Demo02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class test02 {
    public static Comparator<String> method() {
        return (o1, o2) -> o1.length() - o2.length();
    }

    public static void main(String[] args) {
        String[] str = {"Li","Chao","Fan"};
        Arrays.sort(str,method());
        System.out.println(Arrays.toString(str));
    }
}

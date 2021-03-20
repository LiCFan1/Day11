package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test02 {
    public static void main(String[] args) {
        func2();

    }

    private static void func2() {
        Collection<String> arr = new ArrayList<>();
        arr.add("li");
        arr.add("Chap");
        Iterator<String> it = arr.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next.length());
        }
    }

    private static void func1() {
        Collection dict = new ArrayList();
        dict.add("Li");
        dict.add(1);
        dict.add(8.8);
        System.out.println(dict);   //[1, Li, 8.8]
        Iterator it = dict.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s.length());
        }
    }
}

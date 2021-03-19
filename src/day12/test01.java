package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test01 {
    public static void main(String[] args) {
        func();
        func2();
        func3();
        }

    private static void func3() {
        Collection<String> coll = new ArrayList<>();
        coll.add("Li");
        coll.add("Chao");
        coll.add("Fan");
        for(String s:coll){
            System.out.println(s);
        }
    }

    private static void func2() {
        int[] arr ={1,2,3};
        for(int a:arr){
            System.out.println(a);
        }
    }

    private static void func() {
        Collection<String> coll = new ArrayList<>();
        coll.add("Li");
        coll.add("Chao");
        coll.add("Fan");
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
    }
}
}

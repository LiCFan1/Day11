package day12;

public class test04 {
    public static void main(String[] args) {
        func(2);
        func("li");
        func(3.3);

    }

    public static <E> void func(E e){
        System.out.println(e);
    }
}

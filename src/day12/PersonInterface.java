package day12;

public interface PersonInterface<E> {
    public abstract void func1(E e);        // 抽象方法
    public  static <E> void func2(E e){     // 静态方法
        System.out.println(e);
    }
}

package day12;

public class PersonImp2<E> implements PersonInterface<E>{
    @Override
    public void func1(E e) {
        System.out.println(e);
    }
}

package Demo2;

import domain.Person;

import java.lang.reflect.Field;

public class test02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class cls = Person.class;
        Field[] fields = cls.getFields();   //public int domain.Person.a
        Field[] declaredFields = cls.getDeclaredFields();   // 可以打印全部的变量

        Field a = cls.getDeclaredField("age");
        Person p = new Person();
        a.setAccessible(true);
        a.set(p,3);
        System.out.println(p);
    }
}

package Demo2;

import domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test04 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class cls = Person.class;
        Method m = cls.getMethod("eat");
        Person p = new Person();
        m.invoke(p);

        Method m2 = cls.getMethod("eat", String.class);
        m2.invoke(p,"fan");
        String name = m2.getName();
        System.out.println(name);

        String name1 = cls.getName();
        System.out.println(name1);
    }
}

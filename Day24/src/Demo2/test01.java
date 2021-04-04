package Demo2;

import domain.Person;

public class test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = Class.forName("domain.Person");
        System.out.println(cls);    //class domain.Person

        Class cls2 = Person.class;

        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls == cls2);    // true
        System.out.println(cls == cls3);    // true

    }
}

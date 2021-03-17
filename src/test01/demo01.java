package test01;

import java.util.Objects;

public class demo01 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "demo01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        demo01 demo01 = (demo01) o;
        return age == demo01.age &&
                Objects.equals(name, demo01.name);
    }


    public demo01() {
    }

    public demo01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

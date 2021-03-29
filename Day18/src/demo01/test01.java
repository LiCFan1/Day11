package demo01;

import java.io.File;

public class test01 {
    public static void main(String[] args) {
        func3();
    }

    private static void func3() {
        File parent = new File("F:\\JAVA\\java_test\\day11");
        String child = "a.txt";
        File file = new File(parent,child);
        System.out.println(file);   // F:\JAVA\java_test\day11\a.txt
    }

    private static void func2() {
        String parent = "F:\\JAVA\\java_test";
        String child = "day11";
        File file = new File(parent,child);
        System.out.println(file);   //F:\JAVA\java_test\day11
    }

    private static void func1() {
        String pathName = "F:\\JAVA\\java_test\\day11";
        File file1 = new File(pathName);
        System.out.println(file1);  //F:\JAVA\java_test\day11
    }
}

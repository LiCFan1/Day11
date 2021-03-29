import java.beans.FeatureDescriptor;
import java.io.File;

public class test02 {
    public static void main(String[] args) {
        func3();
    }

    private static void func3() {
        File f1 = new File("F:\\JAVA\\java_test\\day11\\day11.iml");
        long length = f1.length();
        System.out.println(length); // 433
    }

    private static void func2() {
        File f1 = new File("F:\\JAVA\\java_test\\day11\\1.txt");
        String name = f1.getName();
        System.out.println(name);   //1.txt
    }

    private static void func1() {
        File f1 = new File("1.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);   //F:\JAVA\java_test\day11\1.txt
    }
}

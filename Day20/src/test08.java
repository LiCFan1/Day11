import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test08 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Day20\\\\aaa\\\\888.txt"));
        Object o = ois.readObject();
        Person p = (Person) o;
        System.out.println(p);
    }
}

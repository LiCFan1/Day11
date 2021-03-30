import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test07 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Day20\\aaa\\888.txt"));
        oos.writeObject(new Person("Li",18));
        oos.close();
    }
}

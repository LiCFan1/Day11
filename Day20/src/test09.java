import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test09 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Day20\\aaa\\999.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Day20\\aaa\\999.txt"));

        List<Person> list = new ArrayList<>();
        list.add(new Person("Li",18));
        list.add(new Person("Chao",19));
        list.add(new Person("Fan",20));

        oos.writeObject(list);
        oos.close();

        Object o = ois.readObject();
        ArrayList<Person> l1 = (ArrayList<Person>) o;
        for (Person person : l1) {
            System.out.println(person);
        }

        ois.close();
    }
}

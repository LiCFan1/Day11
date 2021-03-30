import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class test06 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("Li","18");
        prop.setProperty("Chao","19");
        prop.setProperty("Fan","20");

        prop.store(new FileWriter("Day19\\333.txt"),"save date");


        Properties prop2 = new Properties();
        prop2.load(new FileReader("Day19\\333.txt"));
        Set<String> strings = prop2.stringPropertyNames();
        for(String str:strings){
            System.out.println(str + "--" + prop2.getProperty(str));
        }

    }
}

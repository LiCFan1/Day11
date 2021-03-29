import java.io.FileWriter;
import java.io.IOException;

public class test05 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("Day19\\bbb\\22.txt", true);) {
            char[] c = {'0', '李', '超', '凡'};
            fw.write(c, 1, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

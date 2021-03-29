import java.io.FileWriter;
import java.io.IOException;

public class test04 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Day19\\bbb\\22.txt",true);
        char[] c = {'0','李','超','凡'};
        fw.write(c,1,3);

        fw.write("\r\n");
        fw.write("啊你好吗",1,2);
        fw.flush();
        fw.close();
    }
}

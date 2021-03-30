import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class test05 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Day20\\aaa\\666.txt"),"GBK");
        osw.write("李超凡你好啊啊啊啊啊");
        osw.close();
    }
}

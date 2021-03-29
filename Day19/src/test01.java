import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test01{
    public static void main(String[] args) throws IOException {
        File file = new File("Day19\\aaa\\bbb.txt");
        FileOutputStream fos = new FileOutputStream(file,true);
        byte[] b = {97,98,99,100};
        fos.write(b,0,3);
        fos.write("\r\n".getBytes());
        fos.write(100);
        fos.close();
    }
}

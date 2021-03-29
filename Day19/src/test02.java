import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class test02 {
    public static void main(String[] args) throws IOException {
        File file = new File("Day19\\aaa\\bbb.txt");
        FileInputStream fis = new FileInputStream(file);
        int len;
        byte[] b = new byte[1024];
        while((len = fis.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }
}

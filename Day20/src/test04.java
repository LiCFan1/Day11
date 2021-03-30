import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class test04 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Day20\\aaa\\555.txt"),"GBK");
        int read;
        while((read = isr.read()) != -1){
            System.out.print((char)read);
        }
        isr.close();
    }
}

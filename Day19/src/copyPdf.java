import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyPdf {
    public static void main(String[] args) throws IOException {
        File file = new File("Day19\\aaa\\01.pdf");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("Day19\\02.pdf");

        byte[] b = new byte[1024];
        int len;

        while((len = fis.read(b)) != -1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}

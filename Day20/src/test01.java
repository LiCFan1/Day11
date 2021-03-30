import java.io.*;

public class test01 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day20\\aaa\\111.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Day20\\aaa\\222.txt"));

        byte[] b = new byte[1024];
        int len;
        while((len = bis.read(b))!=-1){
            bos.write(b,0,len);
        }

        bos.close();
        bos.close();
    }
}

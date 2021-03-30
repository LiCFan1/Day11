import java.io.*;

public class test06 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("Day20\\aaa\\666.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Day20\\aaa\\777.txt"),"utf-8");

        int len;
        while((len = isr.read()) != -1){
            osw.write(len);
        }

        osw.close();
        isr.close();
    }
}

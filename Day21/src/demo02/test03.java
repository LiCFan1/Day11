package demo02;

import java.io.*;
import java.net.Socket;

public class test03 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 8888);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day21\\01.pdf"));
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());

        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        client.shutdownOutput();

        InputStream is = client.getInputStream();
        while ((len = is.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }

        is.close();
        client.close();
        bis.close();
    }
}

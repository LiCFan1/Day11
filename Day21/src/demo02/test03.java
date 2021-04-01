package demo02;

import java.io.*;
import java.net.Socket;

// 客户端
public class test03 {
    public static void main(String[] args) throws IOException {
        // 1.创建客户端Socket类，设置端口号为8888
        Socket client = new Socket("localhost", 8888);
        // 2.创建字符缓冲输入流，用于读取本地需要上传的文件
        // BufferedInputStream内放入InputStream对象，这里使用多态的方法，放入子类FileInputStream
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Day21\\01.pdf"));
        // 3.创建字符缓冲输出流，用于向服务器上传文件
        // BufferedInputStream内放入OutputStream对象，这里通过socket.get获取
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        // 4.创建一个缓冲数组，在缓冲输入流的基础上再增加读取速度
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        client.shutdownOutput();    // 增加文件的终止符，否则传给服务器的文件内没有-1

        // 5.创建socket对象的字节输入流，用于读取服务器返回的数据
        InputStream is = client.getInputStream();
        while ((len = is.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        // 6.释放流
        // 这里若是释放通过socket对象创建的bos流会报错
        is.close();
        client.close();
        bis.close();
    }
}

package demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// 客户端
public class test01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        os.write("李超凡".getBytes());
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        byte[] b = new byte[1024];
        int len;
        System.out.println("11111");
        while((len = is.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        System.out.println("22222");
        is.close();
        os.close();
        socket.close();
    }

//    public static void main(String[] args) throws Exception {
//        System.out.println("客户端 发送数据");
//        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
//        Socket client = new Socket("localhost", 6666);
//        // 2.通过Scoket,获取输出流对象
//        OutputStream os = client.getOutputStream();
//        // 3.写出数据.
//        os.write("你好么? tcp ,我来了".getBytes());
//        // ==============解析回写=========================
//        // 4. 通过Scoket,获取 输入流对象
//        InputStream in = client.getInputStream();
//        // 5. 读取数据数据
//        byte[] b = new byte[100];
//        int len = in.read(b);
//        System.out.println(new String(b, 0, len));
//        // 6. 关闭资源 .
//        in.close();
//        os.close();
//        client.close();
//    }

}
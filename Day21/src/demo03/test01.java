package demo03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// http://localhost:8888/Day21/web/index.html
public class test01 {
    public static void main(String[] args) throws IOException {
        // 1.创建服务器，并声明端口号
        ServerSocket ss = new ServerSocket(8888);
        while(true){
            // 2. 接收网页的对象socket，方便使用socket中的输入流和输出流
            Socket socket = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 3.在try中创建上传服务器的代码，因为使用匿名内部类的方法构建对象，因此不可以抛出，只能try
                    // （1）BufferedReader用于读取网页返回的字符，BufferedReader中应传入Reader对象，这里使用了多态的方法，
                    // 传入InputStreamReader对象；InputStreamReader中应传入InputStream对象，这里传入通过socket获取的InputStream对象
                    // （2）OutputStream用于返还给网页数据，即内容、图片等
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                         OutputStream os = socket.getOutputStream();){
                        // 4. 获取网页在服务器中的路径，在网页返还给服务器的第一行，并通过字符串分割split、截取substring方法获取路径
                        String requst = br.readLine();
                        String[] s = requst.split(" ");
                        String sb = s[1].substring(1);
                        // 5. 创建FileInputStream对象，用于读取服务器中网址文件的内容
                        FileInputStream fis = new FileInputStream(sb);

                        byte[] b = new byte[1024];
                        int len = 0;
                        // 写入HTTP协议响应头,固定写法
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content‐Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\r\n".getBytes());

                        // 6.读取服务器中本地网址文件的字节，并将该字节返还给网页（写给网页）
                        while((len = fis.read(b)) != -1){
                            os.write(b,0,len);
                        }

                        // 7.释放流.br、os在try中构建，因此会自动释放
                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}

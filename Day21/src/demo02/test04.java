package demo02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

// 服务器
public class test04 {
    public static void main(String[] args) throws IOException {
        // 1. 创建服务器
        ServerSocket ss = new ServerSocket(8888);

        while (true) {
            // 2.通过accept方法读取客户端的对象，方便构建输入流和输出流
            // 创建一个用于保存的文件夹
            Socket socket = ss.accept();
            File file = new File("Day21\\download");
            if (!file.exists()) {
                file.mkdirs();
            }
            //3. 创建一个多线程，增加处理速度
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 4. 在try中创建上传服务器的代码，因为使用匿名内部类的方法构建对象，因此不可以抛出，只能try
                    // （1）构建BufferedInputStream用于读取客户端的数据，BufferedInputStream内放入InputStream对象，这里放入通过socket创建的
                    // （2）构建OutputStream用于给客户端回写数据
                    // （3）构建BufferedOutputStream用于从客户端的数据保存到服务器上，BufferedOutputStream内放入OutputStream对象
                    // 这里使用多态的方法放入了FileOutputStream，（FileOutputStream为OutputStream的子类）
                    try (BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                         OutputStream os = socket.getOutputStream();
                         BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file + "\\" + System.currentTimeMillis() + new Random().nextInt(10000) + ".pdf"));) {
                        // 5. 建立一个字节缓冲区，增加读取速度，通过bis读取客户端发回来的数据，bos存放到服务器本地
                        byte[] b = new byte[1024];
                        int len;
                        while ((len = bis.read(b)) != -1) {
                            bos.write(b, 0, len);
                        }
                        // 6. 通过os回写给客户端数据
                        os.write("服务器端保存成功！".getBytes());
                        // 7. 释放流，os、bis、bos由于在try中构建，可以自动释放
                        socket.close();

                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }

    }
}

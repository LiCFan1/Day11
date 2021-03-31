package demo02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class test04 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);

        while (true) {
            Socket socket = ss.accept();
            File file = new File("Day21\\download");
            if (!file.exists()) {
                file.mkdirs();
            }
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try (BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                         OutputStream os = socket.getOutputStream();
                         BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file + "\\" + System.currentTimeMillis() + new Random().nextInt(10000) + ".pdf"));) {
                        byte[] b = new byte[1024];
                        int len;
                        while ((len = bis.read(b)) != -1) {
                            bos.write(b, 0, len);
                        }
                        os.write("服务器端保存成功！".getBytes());

                        socket.close();

                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }

    }
}

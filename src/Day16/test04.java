package Day16;

public class test04 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("通过Runnable创建的实现类开始啦"+Thread.currentThread().getName());
            }
        },"Li").start();
    }
}

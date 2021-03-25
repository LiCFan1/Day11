package Day16;

public class test02 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread th = new Thread(r,"新的线程");
        th.start();
    }
}

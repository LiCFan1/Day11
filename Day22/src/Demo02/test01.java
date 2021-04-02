package Demo02;

public class test01 {
    public static void method(Runnable r) {
        new Thread(r).start();
    }

    public static void main(String[] args) {
        method(() -> System.out.println("线程执行了！"));
    }
}

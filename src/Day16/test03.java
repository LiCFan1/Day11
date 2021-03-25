package Day16;

public class test03 {
    public static void main(String[] args) {
        new Thread("Li"){
            @Override
            public void run() {
                System.out.println("一个线程开始了");
            }
        }.start();
    }
}

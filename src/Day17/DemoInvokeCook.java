package Day17;

public class DemoInvokeCook {
    public static void main(String[] args) {
        invokeCook(() ->
            System.out.println("吃饭啦！")
        );
    }

    public static void invokeCook(Cook c){
        c.makeFood();
    }
}

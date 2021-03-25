package Day17;

public class InvokeCalc {
    public static void main(String[] args) {
        invokeCalc(10, 20, (a, b) ->
                a + b
        );

    }

    private static void invokeCalc(int a, int b, Calculator c) {
        int result = c.calc(a, b);
        System.out.println("结果是" + result);
    }
}

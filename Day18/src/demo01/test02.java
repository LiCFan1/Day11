package demo01;

public class test02 {
    public static void main(String[] args) {
        int n = 5;
        int value = getValue(n);
        System.out.println(value);
    }

    private static int getValue(int n) {
        if(n == 1){
            return 1;
        }
        return n * getValue(n-1);
    }
}

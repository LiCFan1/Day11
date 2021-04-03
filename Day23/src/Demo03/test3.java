package Demo03;

public class test3 {
    public static void method(String str, Printable p){
        p.print(str);
    }

    public static void main(String[] args) {
        MethodRefObject obj = new MethodRefObject();
        method("hello",obj::printUpper);
        method("hello", new Printable() {
            @Override
            public void print(String str) {
                obj.printUpper(str);
            }
        });
    }
}

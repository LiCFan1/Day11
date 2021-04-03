package Demo03;

public class test02 {
    public static void method(String str ,Printable p){
        p.print(str);
    }

    public static void main(String[] args) {
        String name ="Li";
        method(name,System.out::println);
    }
}

package Demo01;

public class test01 {
    public static void log(int i, String str) {
        if (i == 1) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String name1 = "Li";
        String name2 = "Chao";
        String name3 = "Fan";
        log(1, name1 + name2 + name3);
    }

}

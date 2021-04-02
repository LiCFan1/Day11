package Demo01;

public class test02 {
    public static void log(int i,MessageBuilder msg){
        if(i == 1){
            System.out.println(msg.method());
        }
    }

    public static void main(String[] args) {
        String name1 = "Li";
        String name2 = "Chao";
        String name3 = "Fan";
        log(1,() -> name1+name2+name3);
    }
}

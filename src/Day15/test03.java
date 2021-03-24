package Day15;

import java.io.FileNotFoundException;

public class test03 {
    public static void main(String[] args) {
        try {
            read("a.tx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }

    private static void read(String s) throws FileNotFoundException {
        if( ! s.equals("a.txt")){
            throw new FileNotFoundException("文件找不到哦");
        }
    }
}

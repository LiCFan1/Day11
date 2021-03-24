package Day15;

import java.io.FileNotFoundException;

public class test02 {
    public static void main(String[] args) throws FileNotFoundException {
        read("a.tx");
    }

    private static void read(String s) throws FileNotFoundException{
        if( ! s.equals("a.txt")){
            throw new FileNotFoundException("文件找不到哦");
        }
    }
}

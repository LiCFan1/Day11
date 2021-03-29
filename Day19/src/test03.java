import java.io.FileReader;
import java.io.IOException;

public class test03 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Day19\\bbb\\11.txt");
        int len;
        char[] c = new char[1024];
        while((len = fr.read(c)) != -1){
            System.out.println(new String(c,0,len));
        }
        fr.close();
    }
}

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("Day20\\aaa\\test01.txt")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Day20\\aaa\\test02.txt")));

        Map<String,String> map = new HashMap<>();

        String length = null;
        while((length = br.readLine()) != null){
            String[] s = length.split("\\.");
            map.put(s[0],s[1]);
        }
        br.close();

        for (String s : map.keySet()) {
            bw.write(s+"."+map.get(s));
            bw.newLine();
        }
        bw.close();
    }
}

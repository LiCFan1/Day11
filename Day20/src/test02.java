import java.io.*;

public class test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Day20\\aaa\\333.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Day20\\aaa\\444.txt"));

        String line = null;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}

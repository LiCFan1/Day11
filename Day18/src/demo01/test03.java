package demo01;

import java.io.File;

public class test03 {
    public static void main(String[] args) {
        File dir = new File("F:\\JAVA\\java_test\\day11\\Day18\\aaa");
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles();

        for(File file:files){
            if(file.isFile()){
                System.out.println(file.getName());
            }else{
                printDir(file);
            }
        }

    }
}

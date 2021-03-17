package test01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的生日：yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = d.parse(s);
        long yourTime = parse.getTime();

        Date date = new Date();
        long time = date.getTime();


        long rest = time - yourTime;

        if(rest < 0){
            System.out.println("输入错误");
        }else{
            System.out.println(rest/1000/60/60/24);
        }




    }
}

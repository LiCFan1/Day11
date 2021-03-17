package test01;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo04 {
    public static void main(String[] args) throws ParseException {
        func2();
    }

    private static void func2() throws ParseException {
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "2021-03-17 19:18:54";
        Date parse = d.parse(str);
        System.out.println(parse);  //Wed Mar 17 19:18:54 CST 2021
    }

    private static void func() {
        Date d = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(d);
        System.out.println(str);    //2021-03-17 19:18:54
    }
}

package test01;

import java.util.Date;

public class demo03 {
    public static void main(String[] args) {
        func();
    }

    private static void func2() {
        Date d = new Date(0L);
        System.out.println(d);      //Thu Jan 01 08:00:00 CST 1970
    }

    private static void func() {
        Date d = new Date();
        System.out.println(d);  //Wed Mar 17 19:15:15 CST 2021
        long time = d.getTime();
        System.out.println(time);   //1615979715022
    }
}

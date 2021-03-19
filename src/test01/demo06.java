package test01;

import java.util.Calendar;
import java.util.Date;

public class demo06 {
    public static void main(String[] args) {
        func3();
    }

    private static void func3() {
        Calendar cr = Calendar.getInstance();
        Date time = cr.getTime();
        System.out.println(time);       //Wed Mar 17 22:19:06 CST 2021
    }

    private static void func2() {
        Calendar cr = Calendar.getInstance();
        cr.add(Calendar.YEAR,1);
        System.out.println(cr.get(Calendar.YEAR));  //2022
    }

    private static void func1() {
        Calendar cr = Calendar.getInstance();
        int year = cr.get(Calendar.YEAR);
        System.out.println(year); // 2021

        cr.set(Calendar.MONTH,1);
        int month = cr.get(Calendar.MONTH);
        System.out.println(month);  //1
    }
}
